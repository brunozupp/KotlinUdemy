package com.novelitech.oop.classes

fun main() {

    val classOneLesson = ClassOneLesson()

    classOneLesson.model = "Corola"

    classOneLesson.start()
    classOneLesson.drive(70)

    println()
    println("--------------------------")
    println()

    val jetpackUserFly = JetpackUserFly()

    jetpackUserFly.burn(10)

    jetpackUserFly.stop(3)
    jetpackUserFly.stop(2)
}

class ClassOneLesson {

    var model: String? = null
    var topSpeed = 100

    fun start() {
        println("The car is starting - $model")
    }

    fun drive(speed: Int) {
        println("Driving at a speed of $speed")
    }
}

class JetpackUserFly {

    var userHeight = 0

    fun burn(seconds: Int) {
        userHeight += seconds
        println("New height = $userHeight")
    }

    fun stop(seconds: Int) {

        val newHeight = userHeight - (seconds * 3)

        if(newHeight < 0) {
            println("Forbidden value. User height can not go below 0")
        } else {
            userHeight = newHeight
            println("New height = $userHeight")
        }
    }
}