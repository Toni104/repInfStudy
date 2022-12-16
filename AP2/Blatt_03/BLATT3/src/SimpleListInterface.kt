interface SimpleListInterface<T> {

    fun isEmpty() : Boolean
    fun addFirst(data: T)
    fun getFirst() : T?
    fun clear()

    fun size() : Int
    fun get(index: Int) : T
    fun getOrNull(index: Int) : T?
    fun addLast(data: T)

    fun forEach (action: (T) -> Unit)
    fun sizeWithForEach () : Int
    fun countWhere(condition: (T) -> Boolean) : Int

}