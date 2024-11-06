package exceptions

fun main() {

    try {

        val number = readlnOrNull()?.toInt() ?: 0

        println("The number is $number")

    } catch (error: NumberFormatException) {
        println("Occurred an error about format: ${error.localizedMessage}")
        error.printStackTrace()
    } catch(error: Exception) {
        println("Unexpected error occurred now: ${error.localizedMessage}")
        println(error.stackTraceToString())
    } finally {
        println("Finally block here")
    }
}