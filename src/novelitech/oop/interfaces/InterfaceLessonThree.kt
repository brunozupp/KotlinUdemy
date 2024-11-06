package com.novelitech.oop.interfaces

/**
 * An interface has no constructor
 * An interface can implement methods, but it doesn't need to do it
 * An interface can not have value assign to its variables, just the signature of the attribute. But the interesting
 * fact here is that it can update the value from the attribute
 * An interface can inherit from another interface
 */
interface DancerInterfaceLessonThree {

    val name: String

    // I CAN NOT have attributes initialized inside an interface
    // val timeOfDancing: Int = 3

    // What I can have is an attribute with a get method
    val timeOfDancing: Int
        get() = 3

    val styleOfDance: String

    fun dance()

    fun jump() {
        println("Jump first interface")
    }
}

interface StreetDancerInterfaceLessonThree : DancerInterfaceLessonThree {

    // I can override attributes. Doing this I don't need to pass this attribute in the constructor from the base class
    override val styleOfDance: String
        get() = "Street Dance"

    val styles: List<String>

    fun printMovements()

    // I can override methods too from other interfaces
    override fun jump() {
        println("Jump second interface")
    }
}

class ArtistInterfaceLessonThree(
    override val name: String,
    override val styles: List<String>,
) : StreetDancerInterfaceLessonThree {

    override fun printMovements() {
        println("Movements are really hard to do")
    }

    override fun dance() {
        println("The style of dance from the artist $name is $styleOfDance")
    }
}

fun main() {

    val dancer = ArtistInterfaceLessonThree(
        name = "Bruno",
        styles = listOf("Style 1", "Style 2", "Style 3")
    )

    println(dancer.name)
    println(dancer.styles)
    println(dancer.styleOfDance)
    dancer.jump()
}