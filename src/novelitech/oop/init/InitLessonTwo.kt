package com.novelitech.oop.init

/**
 * The init block has the same behavior in an object
 * It will trigger the init block when I call this class for the first time
 *
 */
object CarTwoInit {

    val name: String = "Car"
    val isFourDoors: Boolean = true
    var maxSpeed: Double? = 1.4

    init {

        println("Calling the init")
        println(name)
        println(isFourDoors)
        println(maxSpeed)
    }
}

fun main() {

    // Just doing this the init block will be executed
    var carSpecial = CarTwoInit

    val carOne = CarTwoInit.name
    val carTwo = CarTwoInit.name
    println(carOne)
}