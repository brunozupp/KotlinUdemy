package com.novelitech.oop.constructors

// If I have just one constructor I do just like this and I don't need a body to my class
class CarOneConstructor(
    val type: String,
    val maxSpeed: Double,
    val isFourDoors: Boolean,
    var name: String? = null,
)

fun main() {

    val carOne = CarOneConstructor(
        "Corola",
        160.5,
        true,
        name = "Something"
    )

    carOne.name = "New name"

    println(carOne)

    val carTwo = CarOneConstructor(
        maxSpeed = 145.0,
        type = "Fusca",
        isFourDoors = false,
    )

    println(carTwo)
}