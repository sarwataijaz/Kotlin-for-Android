fun main() {

    println("Enter a year: ")
    var year : Int? = readLine()?.toIntOrNull()

    if(year!=null) {
        if (year < 0) {
            println("Invalid year.")
        }
        else if(year%4 == 0 && year%100 == 0 && year%400 == 0) {
            println("Its a leap year.")
        }
        else {
            println("Its not a leap year.")
        }
    }
}

