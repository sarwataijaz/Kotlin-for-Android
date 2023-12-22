fun reverse(text : String) : String {

    var reverseMsg : String = ""
    for(i in text.length-1 downTo 0) {
        reverseMsg += text[i]
    }
    return reverseMsg
}

fun main() {

    println("Enter a string: ")
    var msg : String = readLine() ?: "default"
    println("Entered string: $msg")
    println("Reversed string: " + reverse(msg))

}


