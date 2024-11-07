package lateinit

/**
 * Allow us to create non null, non initialized variables
 * Need to initialize the variable before using it
 * Accessing it before initializing it throws an exception
 * Can be used only on var variables
 * Use .isInitialized to check initialization
 *
 * This is especially useful while working with dependency injection or testing frameworks.
 */

class BoxLateInitLessonOne {
    lateinit var name: String

    fun verifyInitialization() {
        if(this::name.isInitialized) {
            println("It's initialized")
        } else {
            println("It's not initialized")
        }
    }
}

fun main() {


    lateinit var nickname: String

    BoxLateInitLessonOne().verifyInitialization()

    try {

        println(nickname)

    } catch (e: Exception) {
        println(e.message)
        println(e.stackTraceToString())
    }
}