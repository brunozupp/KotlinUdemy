package lambdafunctions

/**
 * It's basically functions that don't have a name
 * It can be used as parameters to other functions.
 * Functions that receive a function as parameter are called higher order function
 *
 * Example of lambda
 * { name: String -> println("Hello $name") }
 *
 * A lambda function can have parameters they are declared at the start of the block
 */

fun main() {

    // It can be assigned to a variable
    // And this variable can be passed as parameter to a new function (Higher order functions)
    val myLambda = { name: String -> println("Hello, $name") }
}

