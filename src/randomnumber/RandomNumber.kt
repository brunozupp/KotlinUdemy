package randomnumber

import kotlin.random.Random

fun main() {

    val randomNumber = Random.nextInt()
    println(randomNumber)

    val randomNumberUntil = Random.nextInt(10) // 0 - 9
    println(randomNumberUntil)

    val randomNumberRange = Random.nextInt(10, 30) // 10 - 29
    println(randomNumberRange)
}