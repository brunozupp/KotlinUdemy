package com.novelitech.oop.interfaces

/**
 * An interface has no constructor
 * An interface can implement methods, but it doesn't need to do it
 * An interface can not have value assign to its variables, just the signature of the attribute. But the interesting
 * fact here is that it can update the value from the attribute
 * An interface can inherit from another interface
 */
interface DancerInterfaceLessonTwo {

    val name: String

    // I CAN NOT have attributes initialized inside an interface
    // val timeOfDancing: Int = 3

    // What I can have is an attribute with a get method
    val timeOfDancing: Int
        get() = 3

    val styleOfDance: String

    fun dance()
}

interface MusicianInterfaceLessonTwo {

    val name: String

    val styleOfMusic: String

    var repeatedSongs: Int

    // I can update the values from the attributes
    fun incrementRepeatedSongs() {
        repeatedSongs++
    }

    fun sing()

    // In an interface I can have methods implemented
    fun singAPoetry() {
        println("Singing a poetry")
    }

    fun singAPoetryTwo() {
        println("Singing a poetry")
    }
}

class ArtistInterfaceLessonTwo(
    override val styleOfDance: String,
    override val styleOfMusic: String,
    override val name: String,
    override var repeatedSongs: Int = 0
) : DancerInterfaceLessonTwo, MusicianInterfaceLessonTwo {

    override fun dance() {
        println("The style of dance from the artist $name is $styleOfDance")
    }

    override fun sing() {
        println("The artist $name sings $styleOfMusic")
    }

    override fun singAPoetryTwo() {
        println("Override the method singAPoetryTwo()")
    }
}

fun main() {

    val artist = ArtistInterfaceLessonTwo(
        name = "Bruno",
        styleOfMusic = "Pop",
        styleOfDance = "Street Dance"
    )

    artist.sing()
    artist.dance()
    artist.singAPoetry()
    artist.singAPoetryTwo()

    println(artist.timeOfDancing)

    for (i in 1..10) artist.incrementRepeatedSongs()

    println("Times repeated: ${artist.repeatedSongs}")
}