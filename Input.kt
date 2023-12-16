
    fun main() {

        // can either hold a value or a nullable type

        println("Enter your name: ")
        val name =  readLine() ?: " " // ?: -> Elvis operator, if the left hand side has no value then provide this one

        println("$name, Enter your age: ")
        val age = readLine()?.toIntOrNull() // safe to operator, returns null if no value provided

        // its essential to control nullable types in Kotlin to avoid null pointer exception

        val msg = if(age!=null && !name.isEmpty()) {
            if(age<=18) {
                "$name, you are allowed to vote."
            } else {
                "$name, you are not allowed to vote."
            }
        } else {
            "You did not enter any age or name :/"
        }

        println(msg)
    }