package com.novelitech.oop.init

/**
 * When I have init blocks in abstract classes, all classes that inherited from it
 * will execute the init block from the father. And if they too implemented the init
 * block it will be executed after the init block from the abstract class (father)
 */
abstract class CarFatherThreeInit(val name: String, val price: Double) {

    init {
        println("Block init: CarFatherThreeInit")
    }
}

class CarThreeInit(
    name: String,
    price: Double,
    val isFourDoors: Boolean,
) : CarFatherThreeInit(
    name, price
) {

    init {
        println("Block init: CarThreeInit")
    }
}

fun main() {

    var carOne = CarThreeInit("Fusca", 145.64, true)

    println(carOne.name)
    println(carOne.price)
    println(carOne.isFourDoors)
}