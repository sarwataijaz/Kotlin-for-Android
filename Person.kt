fun main() {

    val p1 = Person("Sarwat",18, "Pakistan")
    p1.print()
}

class Person(name: String, age: Int, country: String) {

    private val n: String
    private val a: Int
    private val c: String

    init {
        n = name
        a = age
        c = country
    }

    fun print() {
        println("Name: $n")
        println("Age: $a")
        println("Country: $c")
    }
}

