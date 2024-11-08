package lazy

/**
 * It will initialize the variable just when I use it in code
 * Otherwise its initialization will not happen, even if I created the instance of the class
 */

class CalculatorLazyLessonTwo {

    private val someLargeVariableDelegate = lazy<Int> {
        59845
    }

    val someLargeVariable by someLargeVariableDelegate

    fun checkUseOfLargeVariable() {
        if(someLargeVariableDelegate.isInitialized()) {
            println("The variable was used")
        } else {
            println("The variable WAS NOT used")
        }
    }
}

fun main() {

    val calculator = CalculatorLazyLessonTwo()

    calculator.checkUseOfLargeVariable() // False

    println(calculator.someLargeVariable)

    calculator.checkUseOfLargeVariable() // True
}