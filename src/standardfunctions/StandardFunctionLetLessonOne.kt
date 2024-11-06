package standardfunctions

import kotlin.random.Random

/**
 * Allow us to run code on an object
 * We can access the result as a lambda function
 * 'it' by default
 * If the block of code contains a single function call, we can use the method reference ::
 */

fun main() {

    val animals = listOf("dog", "cat", "monkey", "elephant", "bird")

    animals
        .map { it.uppercase() }
        .let {
            println(it)
            println("The size of the list is ${it.size}")

            if(it.size > 3) {
                println("The list of animals contains more than 3 items")
            } else {
                println("The list of animals contains less or equals 3 items")
            }

            for (i in it.indices) {
                println("The index of ${it[i]} is $i")
            }
        }

    println()

    // If the block of code contains a single function call, we can use the method reference
    animals
        .filter { it.length > 3 }
        .let(::println)

    println()

    animals
        .let { animalsList ->
            println("I can change the name 'it' to whatever I want\n${animalsList.first()}")
        }

    println()

    val personMap = getPersonMap()

    personMap
        .let {
            println("It will execute in a object that is null. That's why I need to use the ?. " +
                    "operator to safely call the method from the object")
            println(it)

            it?.forEach { key, value ->
                println("Key: $key | Value: $value")
            }
        }

    println()

    /**
     * I can use the .let as a filter to non-nullable variables. All I need to do is put the ?. in variables that can
     * be null before calling the .let, for example: animals?.let { }
     */

    personMap
        ?.let {
            println("The map is not null: $it")

            it.forEach { (key, value) ->
                println("Key: $key | Value: $value")
            }
        }
}

fun getPersonMap() : Map<String, Any>? {

    if(Random.nextInt(1, 7) % 2 == 0) {
        return mapOf(
            "name" to "Bruno",
            "age" to 25,
            "isStudent" to false,
        )
    }

    return null
}