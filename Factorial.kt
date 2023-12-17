fun main() {

    println("Enter a number: ")
    var num : Int? = readLine()?.toIntOrNull()

    var factorial : Int = 1

    if(num!=null) {
        if (num < 0) {
            println("Factorial for a negative number cannot be calculated.")
        } else {
            var i: Int = num
            while(i>=1) {
                factorial *= i
                i--
            }
        }
    }

    println("Factorial: $factorial")
}
