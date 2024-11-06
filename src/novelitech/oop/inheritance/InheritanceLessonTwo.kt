package com.novelitech.oop.inheritance

import kotlin.random.Random

/**
 * In order to make the class available to be inherited I need to use the keyword
 * 'abstract' before class
 *
 * Considerations about 'abstract'
 * - Different from the 'open' modifier, with the abstraction I can have just the assignment of the methods,
 * so the children classes will HAVE to implement them.
 */

abstract class AnimalTwo {

    var name: String? = null

    abstract fun sound()

    // And I can have implemented methods too
    fun eat() {
        println("Eat")
    }
}

class DogTwo : AnimalTwo() {

    fun bark() {
        println("The dog $name is barking a lot")
    }

    override fun sound() {
        println("The dog makes: Au Au")
    }
}

class CatTwo : AnimalTwo() {

    fun play() {
        println("The cat $name wants to play")
    }

    override fun sound() {
        println("The cat makes: Miau Miau")
    }
}

fun main() {

    val dog = DogTwo()
    dog.name = "Fred"

    val cat = CatTwo()
    cat.name = "Umb"

    dog.sound()
    dog.bark()

    cat.sound()
    cat.play()

    val animal: AnimalTwo

    animal = if(Random.nextInt(3) % 2 == 0) {
        DogTwo()
    } else {
        CatTwo()
    }

    println("The type of this object is: ${animal::class.java}")
}

