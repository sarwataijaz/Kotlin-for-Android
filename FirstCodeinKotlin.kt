package com.example.tictactoe

fun main() {
    var message = "World!"
    println("Hello $message") // println for new line
    println("hello ${message.uppercase()}")

    var x : Int = 35
    var y : Int = 40 // mutable

    println(x+y)

    val z : Int = 35 // immutable

    var example : String? = null // kotlin has additional type of string where we can make it null, usually data types of kotlin are by default not null
    println(example)

    val random = if(true) {
        println("Inside if block")
        10 // will return this to the variable, we didnt need to use var for this
    } else {
        20
    }

    println(random)

    when(random) { // works like switch statements

        10 -> {
            println("10 printed")
        }
        20 -> {
            println("20 printed")
        }
        else -> {
            println("Nothing printed")
        }
    }
    // when there is no datatype, kotlin returns a unit datatype, "any" datatype which can be any kind of datatype
}