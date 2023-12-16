fun main() {

    println("Enter: ")
    val num : Int? = readLine()?.toIntOrNull()

    if (num!=null) {
        if (num % 2 == 0) {
            println("Even")
        } else {
            println("Odd")
        }
    }

}

