// Basisstruktur
sealed class Tree <A> {

    abstract fun isEmpty(): Boolean
    abstract fun size(): Int
    abstract fun depth(): Int
    abstract fun <B> map(transform: (A) -> B): Tree<B>

    fun add(value: A, compare: (A, A) -> Int): Tree<A> =
        when (this) {
            is Empty -> treeNode(value)
            is Node -> if (compare(value, this.value) < 1){
                treeNode(this.value, left.add(value,compare), right)
            }
            else {
                treeNode(this.value, left, right.add(value, compare))
            }
        }

    private data class Node<A>(
        val value: A,
        val left: Tree<A>,
        val right: Tree<A>
    ) : Tree<A>() {
        override fun isEmpty(): Boolean = value == null

        override fun size(): Int = 1 + left.size() + right.size()

        override fun depth(): Int {
            if (right.size() <= left.size()) {
                return left.size()
            } else
                return right.size()

        }

        override fun <B> map(transform: (A) -> B): Tree<B> {

            return Node(transform(value), left.map(transform), right.map(transform))
        }


    }


    private object Empty : Tree<Nothing>() {
        override fun isEmpty(): Boolean = true

        override fun size(): Int = 0

        override fun depth(): Int = 0

        override fun <B> map(transform: (Nothing) -> B): Tree<B> {

            return Empty as Tree<B>
        }
    }

    // Hilfsfunktionen zum Erstellen von Bäumen
    fun <A> emptyTree(): Tree<A> = Empty as Tree<A>

    fun <A> treeNode(
        value: A,
        left: Tree<A> = emptyTree(),
        right: Tree<A> = emptyTree()
    ): Tree<A> = Node(value, left, right)


    fun main() {

        println("Baum erzeugt!\n")
/*

    //leftSideOfTree
    val n1 = Node (1, emptyTree(), emptyTree())
    val n2 = Node (2, n1, emptyTree())
    val n4 = Node (4, emptyTree(), emptyTree())
    val n3 = Node (3, n2, n4)

    //rightSideOfTree
    val n10 = Node (10, emptyTree(), emptyTree())
    val n8 = Node (8, emptyTree(), n10)

    val root = Node(5, n3, n8)



    println("Der Baum ist leer: ${root.isEmpty()}")
    println("Kontenanzahl: ${root.size()}")
    println("Baumtiefe: ${root.depth()}")
 */
/*

        var n3 = Node(3, emptyTree(), emptyTree())
        var n8 = Node(8, emptyTree(), emptyTree())
        var root = Node(5, n3, n8)

        println("preTransform: $root ")

        val rootPlusOne = root.map { it + 1 }
        val rootIsODD = root.map { it % 2 != 1 }

        println("afterTransform + 1: ${rootPlusOne} ")
        println("afterTransform is odd: ${rootIsODD} ")
*/


        val compare = { a : Int, b : Int -> a.compareTo(b) }
        var tree = emptyTree<Int>()
        tree = tree.add(2, compare)
        tree = tree.add(1, compare)
        tree = tree.add(3, compare)
    }
}
