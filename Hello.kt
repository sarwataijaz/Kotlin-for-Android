import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {
    println("hello")
    var time = Date()
    var formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    var currentTime = formatter.format(time)

    println("Current date is: $currentTime")
}
