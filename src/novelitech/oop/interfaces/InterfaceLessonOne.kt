package com.novelitech.oop.interfaces

interface AnimalInterfaceLessonOne {

    val name: String

    fun sound()

    fun canEatVegetables() : Boolean

    fun printInformation() {
        println("The animal is named $name")
    }
}

class MonkeyInterfaceLessonOne(override val name: String) : AnimalInterfaceLessonOne {

    override fun sound() {
        println("Monkey Sound")
    }

    override fun canEatVegetables(): Boolean {
        return true
    }
}

fun main() {

    val animal: AnimalInterfaceLessonOne = MonkeyInterfaceLessonOne("George")
    animal.sound()
    println(animal.canEatVegetables())
    animal.printInformation()
}