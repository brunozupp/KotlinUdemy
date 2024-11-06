package com.novelitech.oop.init

/**
 * The init block is run before any other code in the class
 * So the init block will be called before the constructor from the class and that's why
 * I CAN NOT access any of my attributes inside this block.
 * The only way to access my attributes is initializing them in the assignment, for example:
 * val name: String = "test"
 * val isFourDoors: Boolean = true
 * var maxSpeed: Double? = null
 */
class CarOneInit {

    val name: String
    val isFourDoors: Boolean
    var maxSpeed: Double?

    constructor(name: String, isFourDoors: Boolean, maxSpeed: Double? = null) {
        this.name = name
        this.isFourDoors = isFourDoors
        this.maxSpeed = maxSpeed

        println("Calling the constructor")
    }

    init {
        // Error to access these lines because the type of the variables is val
//        println(name)
//        println(isFourDoors)

        // Even the nullable variables given me an error saying that the variable needs to be initialized
        // It does not happen when I initialize with "= null"
//        println(maxSpeed)

        println("Calling the init")
    }
}

fun main() {

    val carOne = CarOneInit("Corola", true)
}