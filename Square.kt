fun calculateSquare(num : Int) : Int {
    fun square() : Int {
        return num*num
    }
    return square()
}

fun main() {
    println("enter a num: ")
    var num : Int? = readLine()?.toIntOrNull()
    if(num == null) {
        println("No number entered")
    } else {
        println(calculateSquare(num))
    }
}
