package com.novelitech.oop.inheritance

/**
 * When using open class if I want to override methods and variables I need to put the word
 * 'open' before its declaration.
 * - open method = Even if I declare my method open I need to implement it in the open class. Then I can override this
 * method in the child class and if I want I can call the father's implementation by using the super keyword
 * - open val attribute = I gain the override from the 'get' method from the attribute
 * - open var attribute = I gain the override from both 'get' and 'set' method from the attribute
 */
open class GenericCarInheritanceLessonThree(
    val name: String,
    val price: Double,
    open val description: String,
    open var weight: Double,
) {

    fun printInformation() {
        println("Name: $name | Price: $price")
    }

    open fun printInformationOpen() {
        println("Open(GenericCarInheritanceLessonOne) -> Name: $name | Price: $price")
    }
}

class CarInheritanceLessonThree(
    name: String,
    price: Double,
    description: String,
    weight: Double,
) : GenericCarInheritanceLessonThree(
    name,
    price,
    description,
    weight,
) {

    override val description: String
        get() = "Value override from attribute description: ${super.description}"

    override var weight: Double = 0.0
        get() = field
        set(value) {
            field = if(value < 10) {
                value
            } else {
                value + 10
            }
        }

    override fun printInformationOpen() {
        println("Override method printInformationOpen")
        println("Open(CarInheritanceLessonOne) -> Name: $name | Price: $price | Description: $description")
    }

    fun printInformationSuper() {
        println("Print information from the method printInformationOpen, but using the implementation from the father (super)")
        super.printInformationOpen()
    }
}

fun main() {

    val carOne = CarInheritanceLessonThree("Corola", 235.34, "Top car", 34.2)

    println("Call method that is not open")
    carOne.printInformation()

    println()

    println("Call method that is open")
    carOne.printInformationOpen()

    println()

    println("Call the print method from the child class that calls the super method")
    carOne.printInformationSuper()

    carOne.weight = 5.0
    println(carOne.weight)

    carOne.weight = 21.0
    println(carOne.weight)

    println(carOne.description)
}