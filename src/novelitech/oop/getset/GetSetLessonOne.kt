package com.novelitech.oop.getset

class CarOneGetSet {

    var name: String = ""
        get() = "The name of this car is $field"
        set(value) {
            if (value.isBlank()) {
                throw Exception("Name is required")
            }

            field = value
        }

    constructor(name: String) {
        this.name = name
    }
}

fun main() {

    val carOne = CarOneGetSet("Corola")

    println(carOne.name)

    carOne.name = "Fusca"
    println(carOne.name)

    try {
        carOne.name = ""
    } catch (e: Exception) {
        println(e.message)
    }
}