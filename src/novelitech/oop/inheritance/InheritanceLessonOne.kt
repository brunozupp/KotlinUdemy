package com.novelitech.oop.inheritance

import kotlin.random.Random

/**
 * In order to make the class available to be inherited I need to use the keyword
 * 'open' before class
 *
 * Considerations about 'open'
 * - I CAN NOT override methods inside the open class in the children
 * - I CAN NOT have just the body of the function in the open class. I need to implement it
 * - If the class has not open modifier it is considered final and cannot be inherited. And it can be instantiated.
 * Knowing this, an open class would be just a normal class in Dart.
 */

open class AnimalOne {

    var name: String? = null

    fun sound() {
        println("Animal $name does some sound")
    }
}

class DogOne : AnimalOne() {

    fun bark() {
        println("The dog $name is barking a lot")
    }
}

class CatOne : AnimalOne() {

    fun play() {
        println("The cat $name wants to play")
    }
}

fun main() {

    val dog = DogOne()
    dog.name = "Fred"

    val cat = CatOne()
    cat.name = "Umb"

    dog.sound()
    dog.bark()

    cat.sound()
    cat.play()

    val animal: AnimalOne

    animal = if(Random.nextInt(3) % 2 == 0) {
        DogOne()
    } else {
        CatOne()
    }

    println("The type of this object is: ${animal::class.java}")

    println()

    val animalOpen = AnimalOne()
    animalOpen.name = "Any animal"

    println(animalOpen.name)
    animalOpen.sound()
}

