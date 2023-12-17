fun main() {

    val pi = 3.14

    println("Enter the radius: ")
    var radius : Double? = readLine()?.toDouble() // converts the nullable string taken from the user to double

    if(radius!=null && radius>0) {
        var area = pi*(radius*radius)
        var perimeter = 2*pi*radius

        println("Area of circle: $area")
        println("Perimeter of circle: $perimeter")
    }
}

