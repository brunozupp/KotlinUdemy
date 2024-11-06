package standardfunctions

import kotlin.random.Random

/**
 * Returns the object if the predicate values to true
 * Otherwise returns null
 */
fun main() {

    for (i in 1..10) {
        val number = Random.nextInt(100)
        println("The number is $number")

        // if the condition is false it returns null
        val evenOrNull = number.takeIf { it % 2 == 0 }
        println("The number is even: $evenOrNull")
    }
}