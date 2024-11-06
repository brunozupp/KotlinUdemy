package standardfunctions

import kotlin.random.Random

/**
 * Returns the object if the predicate values to false
 * Otherwise returns null
 */
fun main() {

    for (i in 1..10) {
        val number = Random.nextInt(100)
        println("The number is $number")

        // If this condition is true it will return null
        val oddOrNull = number.takeUnless { it % 2 == 0 }
        println("The number is odd: $oddOrNull")
    }
}