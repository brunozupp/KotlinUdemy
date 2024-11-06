package collections

fun main() {

    /**
     * A map is a set of key-value pairs
     * Keys are unique, values can be duplicate
     * It's mutable
     *
     * I can create a mutable map with hashMapOf or mutableMapOf
     */

    val numbersNames = hashMapOf(
        Pair(1, "One"),
        Pair(2, "Two"),
        Pair(3, "Three")
    )

    numbersNames.put(4, "Four")
    numbersNames[5] = "Five"
    println(numbersNames)

    numbersNames.remove(2)
    println(numbersNames)

    val anotherMap = mapOf(7 to "Seven", 9 to "Nine")
    numbersNames.putAll(anotherMap)
    println(numbersNames)

    numbersNames[1] = "ONE"
    numbersNames.replace(4, "FOUR")
    println(numbersNames)

    println("The map contains the key 2 ${numbersNames.containsKey(2)}")
    println("The map contains the value FOUR ${numbersNames.containsValue("FOUR")}")

    val anotherAssignOfMap = mutableMapOf(
        "name" to "Bruno",
        "age" to 24,
        "skills" to listOf("learn fast", "good communication", "good writing"),
    )

    // Let's suppose I have a conditional to validate each Pair before add it to the map
    // I can not do it using map, so I need to use other ways

    val chocolatePair = "Chocolate" to 3
    val strawberryPair = "Strawberry" to 7
    val vanillaPair = "Vanilla" to 5
    val rockyRoadPair = "Rocky Road" to 10

    // First one creating a List first to do the conditional necessary
    // I will use the takeIf function to serve as my conditional
    // It's worth mentioning that if the predicate check in the takeIf function returns false, the expression, for example,
    // vanillaPair.takeIf { it.second > 5 } returns null. Further, the listOfNotNull function filters out all null values.
    val flavorsOne = listOfNotNull(
        chocolatePair,
        strawberryPair,
        vanillaPair.takeIf { it.second > 5 },
        rockyRoadPair.takeIf { it.second > 5 }
    ).toMap()
    println(flavorsOne)

    // Alternatively, we can use the built-in map builder – the buildMap function:
    val flavoursTwo = buildMap<String, Int> {
        put(chocolatePair.first, chocolatePair.second)
        put(strawberryPair.first, strawberryPair.second)

        if(vanillaPair.second > 5) {
            put(vanillaPair.first, vanillaPair.second)
        }

        if(rockyRoadPair.second > 5) {
            put(rockyRoadPair.first, rockyRoadPair.second)
        }
    }
    println(flavoursTwo)

    println()

    // Using forEach with map
    val inventory = mutableMapOf(
        "Vanilla" to 24,
        "Chocolate" to 14,
        "Strawberry" to 9,
    )
    println(inventory)

    // Out
    val sales = mutableMapOf(
        "Vanilla" to 7,
        "Chocolate" to 4,
        "Strawberry" to 5,
    )

    // In
    val shipments = mutableMapOf(
        "Chocolate" to 3,
        "Strawberry" to 7,
        "Rocky Road" to 9,
    )

    with(inventory) {
        // merge is used to combine the pairs with same key.
        // in the example, I am adding and subtracting the quantity from each flavour
        // When I call merge is like I am writing inventory.merge. That's because of 'with' block
        sales.forEach { merge(it.key, it.value, Int::minus) }
        shipments.forEach { merge(it.key, it.value, Int::plus) }
    }

    println(inventory)
}