package exceptions

fun main() {

    try {

        val text = readlnOrNull()

        if((text?.length ?: 0) <= 4) {
            throw ShortTextException()
        }

        println(text)

    } catch (error: ShortTextException) {
        println("Text doesn't have the number of characters necessary to go ahead: ${error.localizedMessage}")
        error.printStackTrace()
    } catch(error: Exception) {
        println("Unexpected error occurred now: ${error.localizedMessage}")
        println(error.stackTraceToString())
    } finally {
        println("Finally block here")
    }
}

class ShortTextException : Exception("Message error: text too short")