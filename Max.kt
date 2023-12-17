fun main() {

    // null and zero are two different things in Kotlin
    // null means a variable is unidentified or doesnt contain any value, while zero is a numeric value
    // in kotlin, variables are by default non-nullable or which means they cant hold null values
    // to explicitly define a variable null, we use "?" with the variable type
    // that also happens usually while taking input, bcuz its possible that user doesn't enters any value in it

    println("Enter three numbers: ")
    var num1 : Int? = readLine()?.toIntOrNull()
    var num2 : Int? = readLine()?.toIntOrNull()
    var num3 : Int? = readLine()?.toIntOrNull()

    var max = if(num1!=null && num2!=null && num3!=null) {
        if(num1>num2 && num1>num3)
            num1
        else if(num2>num1 && num2>num3)
            num2
        else
            num3
    } else {
        "You missed any input."
    }

    var min = if(num1!=null && num2!=null && num3!=null) {
        if(num1<num2 && num1<num3)
            num1
        else if(num2<num1 && num2<num3)
            num2
        else
            num3
    } else {
        "You missed any input."
    }
    println("Maximum: $max")
    println("Minimum: $min")
}

