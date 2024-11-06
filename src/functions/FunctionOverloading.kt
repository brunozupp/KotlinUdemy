package functions

fun main() {

    /**
     * two functions can have the same name if they
     * have the different numbers or types of parameters
     */

    greetingOverloading("Bruno")
    greetingOverloading("Bruno", message = "It's me")

    println(multiplyOverloading(5))
    println(multiplyOverloading(5,6))

    println()

    printProductInformation("car", 456.76)

    println()

    printProductInformation(mapOf(
        "apple" to 24.65,
        "cake" to 435.63,
        "juice" to 32.0,
    ))
}

fun greetingOverloading(name: String) = println("Hello, $name")

fun greetingOverloading(name: String, message: String) = println("Hello, $name. $message")

fun multiplyOverloading(number: Int) = number * 2
fun multiplyOverloading(number: Double) = number * 2
fun multiplyOverloading(number: Int, multiplier: Int) = number * multiplier
fun multiplyOverloading(number: Double, multiplier: Int) = number * multiplier
fun multiplyOverloading(number: Int, multiplier: Double) = number * multiplier
fun multiplyOverloading(number: Double, multiplier: Double) = number * multiplier

fun printProductInformation(name: String, price: Double) {
    println("Product: $name | Price: $$price")
}

fun printProductInformation(productsMap: Map<String,Double>) {
    productsMap.forEach { printProductInformation(it.key, it.value) }
}