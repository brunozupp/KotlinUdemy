package functions

fun main() {

    /**
     * Local function is a function inside a
     * function
     */

    println(messageMath('+', 1,2,3,4,5,6,7,8,9))
}

fun messageMath(symbol: Char, vararg numbers: Int) : String {

    fun doMath(symbol: Char, vararg numbers: Int) : Int {
        return when(symbol) {
            '+' -> numbers.fold<Int>(0) { sum, value -> sum + value }
            '-' -> numbers.fold(0) { sub, value -> sub - value }
            else -> 0
        }
    }

    val value = doMath(symbol, *numbers)

    return "The symbol chose is $symbol and the amount of the math is = $value"
}

