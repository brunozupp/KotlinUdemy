package com.novelitech.oop.inheritance

/**
 * In order to make the class available to be inherited I need to use the keyword
 * 'abstract' before class
 *
 * Considerations about 'abstract'
 * - Different from the 'open' modifier, with the abstraction I can have just the assignment of the methods,
 * so the children classes will HAVE to implement them.
 */

abstract class AnimalInheritanceLessonFive(
    open val name: String,
    val weight: Double,
) {

    abstract fun sound()

    // And I can have implemented methods too
    fun eat() {
        println("Eat")
    }
}

/**
 * Using the override in an attribute I can change it from immutable to mutable
 */
class DogInheritanceLessonFive(
    override var name: String,
    weight: Double,
) : AnimalInheritanceLessonFive(
    name,
    weight,
) {

    fun bark() {
        println("The dog $name is barking a lot")
    }

    override fun sound() {
        println("The dog makes: Au Au")
    }
}

class CatInheritanceLessonFive(
    name: String,
    weight: Double,
) : AnimalInheritanceLessonFive(
    name,
    weight,
) {

    fun play() {
        println("The cat $name wants to play")
    }

    override fun sound() {
        println("The cat makes: Miau Miau")
    }
}

fun main() {

    val dog = DogInheritanceLessonFive("Heitor", 23.4)
    dog.name = "Fred"
    println(dog.name)

    val cat = CatInheritanceLessonFive("Let", 23.5)
    println(cat.name)

    val dog2: AnimalInheritanceLessonFive = DogInheritanceLessonFive("Heitor", 23.4)

    /**
     * It gives an error, because the analyzer can not do the smart casting as I assign the variable using the
     * superclass
     */
    // dog2.bark()
}

