fun vowel(message : String): Int /* return type */ {
    var count = 0
    for(i in 0 until message.length) {
        if(message[i] in listOf('a', 'e','i','o','u')) {
            count++
        }
    }
    return count
}
fun main() {
    var msg : String = "Palindrome"
    msg = msg.lowercase()

    println("Vowel count: " + vowel(msg))

}