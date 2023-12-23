abstract class Shape {
    abstract fun area(): Double
}

class Circle(val radius: Double): Shape() {
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}

class Rectangle(val length: Double, val width: Double): Shape() {
    override fun area(): Double {
        return length*width
    }
}

fun main() {
    val circle = Circle(4.5)
    println(circle.area())

    val rectangle = Rectangle(4.0,7.0)
    println(rectangle.area())
}