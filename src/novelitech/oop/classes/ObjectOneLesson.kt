package com.novelitech.oop.classes

/**
 * There are two concepts about Object in Kotlin
 * The first one is about the instantiation of a class that gives me an object
 * The second one is The Object construct. It's similar to a Class. It has variables and methods
 *
 * Class vs Object
 * A class can be instantiated - the instance is called an object.
 * An object is a static class - all methods and variables can be accessed without an instance. This creates a singleton
 * So the keyword 'object' let us create a singleton in an easy way
 *
 * In Kotlin, everything is an Object
 */

object DatabaseAccess {

    var connected = false

    fun connect() {
        connected = true
        println("Connected to database")
    }

    fun disconnect() {
        connected = false
        println("Disconnected from database")
    }
}

fun main() {

    println(DatabaseAccess.connected)
    DatabaseAccess.connect()
    println(DatabaseAccess.connected)
    DatabaseAccess.disconnect()
    println(DatabaseAccess.connected)
}