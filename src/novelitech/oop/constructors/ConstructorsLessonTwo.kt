package com.novelitech.oop.constructors

class CarTwoConstructor {

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
    ) {
        this.type = type
        this.maxSpeed = maxSpeed
        isFourDoors = false
        name = "A generic name"
    }
}

fun main() {

    val carOne = CarTwoConstructor(
        "Corola",
        160.5,
        true,
        "Something"
    )

    val carTwo = CarTwoConstructor(
        "Corola",
        160.5,
    )
}