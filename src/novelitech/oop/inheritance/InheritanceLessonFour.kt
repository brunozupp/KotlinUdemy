package com.novelitech.oop.inheritance

/**
 * With inheritance in a father class where I have more than one constructor, I can have specialized classes with
 * one of those constructors, so the child class will have just one assignment of constructor.
 * And I can have a class with more than one constructor (I don't need to implement all) from the father
 */
open class GenericCarInheritanceLessonFour {

    val name: String
    val price: Double
    val description: String
    val weight: Double

    constructor(
        name: String,
        price: Double,
        description: String,
        weight: Double,
    ) {
        this.name = name
        this.price = price
        this.description = description
        this.weight = weight
    }

    constructor(
        name: String,
        price: Double,
    ) : this(name, price, "", 0.0)

    constructor() : this("", 0.0, "", 0.0)
}

class CarInheritanceLessonFourFull(
    name: String,
    price: Double,
    description: String,
    weight: Double,
) : GenericCarInheritanceLessonFour(
    name,
    price,
    description,
    weight,
)

class CarInheritanceLessonFourEmpty : GenericCarInheritanceLessonFour()

class CarInheritanceLessonFourNameAndPrice(
    name: String,
    price: Double,
) : GenericCarInheritanceLessonFour(
    name,
    price,
)

class CarInheritanceLessonFourEverything : GenericCarInheritanceLessonFour {

    constructor(
        name: String,
        price: Double,
        description: String,
        weight: Double,
    ) : super(name, price, description, weight)

    constructor(
        name: String,
        price: Double,
    ) : super(name, price)

    constructor() : super()
}

fun main() {

    val carFull = CarInheritanceLessonFourFull("First", 23.5, "Something", 89.4)

    val carEmpty = CarInheritanceLessonFourEmpty()

    val carNameAndPrice = CarInheritanceLessonFourNameAndPrice("Fusca", 24.6)

    val carEverythingOne = CarInheritanceLessonFourEverything()
    val carEverythingTwo = CarInheritanceLessonFourEverything("Fusca", 324.5)
    val carEverythingThree = CarInheritanceLessonFourEverything("Fusca", 324.5, "Something", 2356.3)
}