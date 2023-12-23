class MathUtils() {
    companion object { // for static members

        fun squareRoot(value: Int): Double {
            val result = Math.sqrt(value.toDouble())
            return result
        }
        fun factorial(value: Int): Int {
            var result = value
            for(i in value-1 downTo 1) {
                result*=i
            }
            return result
        }
        fun cubeRoot(value: Int): Double {
            val result = Math.cbrt(value.toDouble())
            return result
        }
    }
}

fun main() {
    print("Enter a number: ")
    val num: Int? = readLine()?.toIntOrNull()

    if(num!=null) {

        println("Factorial: " + MathUtils.factorial(num))
        println("Square root: " + MathUtils.squareRoot(num))
        println("Cube Root: " + MathUtils.cubeRoot(num))
    }
}