
fun pascalTriangle(rows : Int) {

    if(rows<1) {
        println("Invalid number of rows.")
    }

    var prevRow = mutableListOf(1)

    for(space in rows-1 downTo 0) {
        print(" ") // for initial 1
    }
    println(prevRow.joinToString(" "))

    for(currentRow in 1 until rows) {
        var nextRow = mutableListOf<Int>()
        nextRow.add(1)

        for (space in (rows - currentRow)-1 downTo 0) {
                print(" ")
        }

        for(i in 1 until currentRow) {
            var sum = prevRow[i-1] + prevRow[i]
            nextRow.add(sum)
        }
        nextRow.add(1)

        println(nextRow.joinToString(" ")) // concise method to concatenate and print a list
        prevRow = nextRow
    }
}

fun main() {
    println("Enter the number of rows: ")
    var rows : Int? = readLine()?.toInt()

    if(rows==null)
        println("Input not given")
    else
    pascalTriangle(rows)
}