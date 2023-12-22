fun calculateSquare(num : Int, square : (Int) -> Int) : Int {
    return square(num)
}

fun main() {
    println("enter a num: ")
    var num : Int? = readLine()?.toIntOrNull()
    if(num == null) {
        println("No number entered")
    } else {
        val square : Int = calculateSquare(num, { a ->
            println("The square is: ")
            a*a
        })
        println(square)
    }
}
