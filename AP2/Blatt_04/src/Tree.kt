// Basisstruktur
//sealed class -> main kann nur in selbiger Datei erzeugt werden
sealed class Tree<A> {

    abstract fun isEmpty(): Boolean
    abstract fun size(): Int
    abstract fun depth(): Int
    abstract fun <B> map(transform: (A) -> B): Tree<B>

    // fügt dem Baum einen neuen Wert hinzu, mithilfe der compare-funktion wird überprüft ob der Wert größer oder kleiner als de bisherige ist
    fun add(value: A, compare: (A, A) -> Int): Tree<A> =
        when (this) {
            is Empty -> treeNode(value)
            is TreeNode -> if (compare(value, this.value) < 1) {
                treeNode(this.value, left.add(value, compare), right)
            } else {
                treeNode(this.value, left, right.add(value, compare))
            }
        }
}

private data class TreeNode<A>(
    val value: A,
    val left: Tree<A>,
    val right: Tree<A>
) : Tree<A>() {
    override fun isEmpty(): Boolean = value == null //Basismethode Aufgabe 2.1, wenn value == null -> Baum leer

    override fun size(): Int = 1 + left.size() + right.size() //rekursive Methode, überprüft die Knoten beider Baumseiten und summiert diese zusätzlich wird die Wurzel addiert

    override fun depth(): Int {
        if (right.size() <= left.size()) {
            return left.size()
        } else
            return right.size()
    } // vergleicht die rechte- und linke Baumseite miteinander, die größere Seite bzw. Anzahl an Knoten wird zurückgegeben

    //bekommt eine Funktion übergeben
    override fun <B> map(transform: (A) -> B): Tree<B> {

        return TreeNode(transform(value), left.map(transform), right.map(transform))
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
): Tree<A> = TreeNode(value, left, right)


fun main() {

    println("Baum erzeugt!\n")

/*

    //Aufgabe 1.2 Binärbaum erzeugen

    //leftSideOfTree
    val n1 = TreeNode(1, emptyTree(), emptyTree())
    val n2 = TreeNode(2, n1, emptyTree())
    val n4 = TreeNode(4, emptyTree(), emptyTree())
    val n3 = TreeNode(3, n2, n4)

    //rightSideOfTree
    val n10 = TreeNode(10, emptyTree(), emptyTree())
    val n8 = TreeNode(8, emptyTree(), n10)

    val root = TreeNode(5, n3, n8)



    println("Der Baum ist leer: ${root.isEmpty()}")
    println("Kontenanzahl: ${root.size()}")
    println("Baumtiefe: ${root.depth()}")



        // Baum erzeugt
        val n3 = TreeNode(3, emptyTree(), emptyTree())
        val n8 = TreeNode(8, emptyTree(), emptyTree())
        val root = TreeNode(5, n3, n8)

        println("preTransform: $root ") //printet den Baum vorm transformieren

        // erzeugt einen neuen Baum, jeder Wert wird um 1 erhöht mithilfe der map-funktion
        val rootPlusOne = root.map { it + 1 }

        // es wird ein neuer Baum erzeugt und überprüft ob die Werte des urpsprünglichen Baumes gerade oder ungerade sind
        val rootIsODD = root.map { it % 2 != 1 }


        //überprüfung der map-funktion
        println("afterTransform + 1: ${rootPlusOne} ")
        println("afterTransform is odd: ${rootIsODD} ")

*/

    // vergleicht zwei ingeger Werte miteinander und
     val compare = { a: Int, b: Int -> a.compareTo(b) }
    var tree = emptyTree<Int>()
    tree = tree.add(5, compare)
    tree = tree.add(3, compare)
    tree = tree.add(8, compare)
    tree = tree.add(4, compare)

    println("$tree")

    val compare2 = { a: Int, b: Int -> a.compareTo(b) }
    var tree2 = treeNode(4)
    println("$tree2")
    tree2 = tree2.add(5, compare2)
    tree2 = tree2.add(3, compare2)
    tree2 = tree2.add(8, compare2)
    tree2 = tree2.add(4, compare2)

    println("$tree2")


 }