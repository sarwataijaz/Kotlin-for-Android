class Series<T: Number>(firstTerm: T, commonDiffRatio: T, numOfTerms: Int) {

    var firstTerm: Double
    var commonDiffRatio: T
    var numOfTerms: Double

    init {
        this.firstTerm = firstTerm.toDouble()
        this.commonDiffRatio = commonDiffRatio
        this.numOfTerms = numOfTerms.toDouble()

    }

    var answer = when(commonDiffRatio) {
        is Double -> {
            var r = commonDiffRatio
            geometric(r)
        }
        is Int -> {
            var d = commonDiffRatio
            arithemtic(d)
        }
        else -> throw IllegalArgumentException("Invalid data type provided")
    }

    fun arithemtic(d: Int): Double {

        var result: Double
        result = (numOfTerms/2) * ((2*firstTerm) + (numOfTerms-1) * d)
        return result

    }

    fun geometric(r: Double): Double {

        var result: Double
        if(r<1.0) {
            result = firstTerm*(1-(Math.pow(r,numOfTerms)))/(1-r)
        } else {
            result = firstTerm*((Math.pow(r,numOfTerms))-1)/(r-1)
        }

        return result
    }

    fun getResult(): Double {
        return answer
    }
}

fun main() {

    val arithmeticSeies = Series(2,3,5)
    println("Arithmetic sequence sum is: " + arithmeticSeies.getResult())

    val geometricSeies = Series(2.0,3.0,5)
    println("Geometric sequence sum is: " + geometricSeies.getResult())
}

