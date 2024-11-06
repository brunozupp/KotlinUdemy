package functions

fun main() {

    /**
     * Variable number of parameters (arguments)
     *
     */

    sayHello("Bruno", "Leo", "Gabriel")

    println()

    val value = doMath('+', 1,2,3,4,5,6)
    println(value)
}

fun sayHello(vararg names: String) {
    names.forEach { println(it) }
}

fun doMath(symbol: Char, vararg numbers: Int) : Int {
    return when(symbol) {
        '+' -> numbers.fold<Int>(0) { sum, value -> sum + value }
        '-' -> numbers.fold(0) { sub, value -> sub - value }
        else -> 0
    }
}