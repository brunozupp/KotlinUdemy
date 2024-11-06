package inconditional

fun main() {

    /**
     * The 'in' keyword checks whether:
     * - A value is in a collection
     * - A value is in a range
     *
     * I have the negation from in operator, using !in
     */

    val numbers = listOf(1,2,3,4,5,6)

    if(3 in numbers) println("The number 3 is inside the list")

    val fruits = setOf("apple", "banana", "orange")

    if("banana" in fruits) println("The fruit banana is inside the set")

    val people = mapOf(
        "bruno" to 25,
        "adriana" to 28,
        "karina" to 28,
    )

    if("bruno" in people) println("The key bruno exist in map")

    if(5 in 1..10) {
        println("In keyword can be used to check if a value is inside a range")
    }

    // ----------------------------------------------------

    if(7 !in numbers) {
        println("7 IS NOT inside the list")
    } else {
        println("7 IS inside the list")
    }

    if("mango" !in fruits) {
        println("Mango IS NOT inside the fruits collection")
    } else {
        println("Mango IS inside the fruits collection")
    }

    if("mauricio" !in people) {
        println("There are NO entry with the key mauricio")
    } else {
        println("Mauricio is inside the map")
    }

    if(27 !in 1..10) {
        println("27 IS NOT inside the range of 1..10")
    }
}