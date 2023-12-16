import java.lang.Exception
import kotlin.system.exitProcess

fun main() {

    println("Enter two values: ")
    val num1 : Int? = readln()?.toIntOrNull()
    val num2 : Int? = readln()?.toIntOrNull()

    println("Enter a operation: +,-,*,/")
    val op: String = readln()

    if(num2 == 0 && op.equals("/")) {
        throw Exception("0 cannot be divided!")

    }
    val result: Int = if (num1 == null || num2 == null || op == null) {
        println("Seems like you missed any input ;/")
        -1
    } else {
        when (op) {
            "+" ->  num1+num2
            "-" -> num1-num2
            "*" -> num1*num2
            "/" -> num1/num2
            else ->-1
        }
    }
    println(result)
}