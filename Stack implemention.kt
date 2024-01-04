interface Stack<T>{
    public fun peek(): T?
    public fun getSize(): Int
    public fun pop(): T?
    public fun push(element: T)
    public fun isEmpty(): Boolean
}

class StackEx<T>: Stack<T> {
    var stackList: ArrayList<T> = ArrayList()

    override fun peek(): T? {
        if(stackList.isEmpty())
            return null
        else {
            return stackList.get(stackList.size - 1)
        }
    }

    override fun getSize(): Int {
        return stackList.size
    }

    override fun pop(): T? {
        if(stackList.isEmpty())
            return null
        else {
            return stackList.removeAt(stackList.size - 1)
        }
    }

    override fun push(element: T) {
        stackList.add(element)
    }

    override fun isEmpty(): Boolean {
        return stackList.isEmpty()
    }
}

fun main() {
    val list : StackEx<Int> = StackEx()

    println(list.isEmpty())

    list.push(23)
    list.push(24)
    list.push(25)

    println(list.peek())
    println(list.isEmpty())
}

