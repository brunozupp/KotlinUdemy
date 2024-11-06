package inputuser

fun main() {

    print("Please, enter something: ")
    val text = readlnOrNull()
    println("You wrote: $text")

    println("\n")

    print("Digit a number: ")
    val number = readlnOrNull() ?: "0" // if the value is null it will replace by "0"
    val numberParsed = number.toInt()
    println("The number you wrote is $numberParsed")
}