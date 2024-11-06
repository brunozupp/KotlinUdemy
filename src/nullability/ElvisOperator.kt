package nullability

fun main() {

    /**
     * ?:
     * Guarantees a result returned
     * Either the actual result for a non-null variable, or a default value
     */

    val text = readlnOrNull() ?: "No text"

    println(text)

    val myName: String? = null

    println("My name is ${myName ?: "Default name"}")
}