package collections

fun main() {

    /**
     * A map is a set of key-value pairs
     * Keys are unique, values can be duplicate
     * It's immutable
     */

    val numbersNames = mapOf(
        Pair(1, "One"),
        Pair(2, "Two"),
        Pair(3, "Three")
    )

    println(numbersNames)

    val emptyMapOne: Map<Int, String> = mapOf()
    val emptyMapTwo = mapOf<Int, String>()

    println(numbersNames[1])
    println(numbersNames.get(1))

    println("The keys from the map are: ${numbersNames.keys}")
    println("The values from the map are: ${numbersNames.values}")

    val jsonPerson = mapOf<String, Any>(
        "name" to "Bruno",
        "age" to 25,
        "skills" to listOf("learn fast", "good communication", "good writing"),
    )

    println(jsonPerson)
}