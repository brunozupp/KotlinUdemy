package nullability

import kotlin.random.Random

fun main() {

    /**
     * !!
     * A developer guarantee that the variable is not null
     */

    val value = returnRandomNumber()

    if(value == null) {
        println("The number returned is null")
    } else {
        println("The number returned is ${value!!}")
    }

    println("The number returned is ${value ?: "null"}")
}

fun returnRandomNumber() : Int? {

    val value = Random.nextInt(0, 10)

    if(value % 2 == 0) return null

    return value
}