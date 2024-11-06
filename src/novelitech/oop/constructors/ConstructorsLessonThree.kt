package com.novelitech.oop.constructors

class CarThreeConstructor {

    val type: String
    val maxSpeed: Double
    val isFourDoors: Boolean
    var name: String? = null

    constructor(
        type: String,
        maxSpeed: Double,
        isFourDoors: Boolean,
        name: String? = null,
    ) {
        this.type = type
        this.maxSpeed = maxSpeed
        this.isFourDoors = isFourDoors
        this.name = name
    }

    constructor(
        type: String,
        maxSpeed: Double,
    ) : this(type, maxSpeed, false, "A generic name")

    constructor(type: String) : this(type, 100.0, false)
}

fun main() {

    val carOne = CarThreeConstructor(
        "Corola",
        160.5,
        true,
        "Something"
    )

    val carTwo = CarThreeConstructor(
        "Corola",
        160.5,
    )

    val carThree = CarThreeConstructor(
        "Corola",
    )
}