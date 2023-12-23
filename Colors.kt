inline class Color1(val color1: String)

data class Color2(val color2: String)

fun main() {
    val v1 = Color1("Red")
    val v2 = Color1("Red")

    val v3 = Color2("Blue")
    val v4 = Color2("Blue")


    println(v1==v2) // true
    // The === operator is not applicable to instances of inline classes
    // for instances of inline classes, == and === behave the same way as the instances point to same memory address
    println(v3==v4) // true
    println(v3===v4) // false in terms of reference equality
}