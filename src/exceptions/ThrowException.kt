package exceptions

fun main() {

    try {

        throw Exception("Error threw to test the feature")

        val number = readlnOrNull()?.toInt() ?: 0

        println("The number is $number")

    } catch (error: NumberFormatException) {
        println("Occurred an error about format: ${error.localizedMessage}")
        println(error.stackTraceToString())
    } catch(error: Exception) {
        println("Unexpected error occurred now: ${error.localizedMessage}")
        println(error.stackTraceToString())
    } finally {
        println("Finally block here")
    }
}