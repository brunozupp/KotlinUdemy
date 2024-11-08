package lazy

/**
 * Lazy variables are variables that are initialized when needed
 * Useful to save memory in case the variables is never accessed
 */

class CalculatorLazyLessonOne {

    val someLargeVariable: Int by lazy {
        59845
    }
}