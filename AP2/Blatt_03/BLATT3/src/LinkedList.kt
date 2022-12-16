class LinkedList<T> : SimpleListInterface<T> {


    //next ist eine Referenzvariable vom Typ Node
    private data class Node<T>(val data: T, var next: Node<T>?)

    private var first: Node<T>? = null


    override fun isEmpty(): Boolean = first == null

    override fun addFirst(data: T) {

        first = Node(data, first)
    }

    override fun getFirst(): T? = first?.data

    override fun clear() {
        first = null
    }

    override fun size() : Int {
        var run = first
        var count = 0

        while (run != null) {
            count++
            run = run.next
        }

        return count

    }

    override fun get(index: Int) : T {
        if ( index < 0) throw IndexOutOfBoundsException()

        var run = first
        var count = 0

        while (count < index && run != null) {
            run = run.next
            count++
        }
        return run?.data ?: throw IndexOutOfBoundsException()
    }

    override fun getOrNull(index: Int) : T? {
        if ( index < 0) return null

        var run = first
        var count = 0

        while (count < index && run != null) {
            run = run.next
            count++
        }
        return run?.data
    }

    override fun sizeWithForEach(): Int {
        var count = 0
        forEach{ count++}
        return count
    }

    override fun countWhere(condition: (T) -> Boolean): Int {
        var count = 0

        forEach{element -> if(condition(element)) count++ }
        return count

    }

    override fun forEach(action: (T) -> Unit) {

    var runpointer = first

        while (runpointer != null) {
            action(runpointer.data)
            runpointer = runpointer?.next
        }


    }

    override fun addLast(data: T) {
        if (isEmpty()) addFirst(data) else {

            var runPointer = first

            while (runPointer?.next != null){
                runPointer = runPointer.next
            }

            runPointer?.next = Node (data, null)
        }
    }
}