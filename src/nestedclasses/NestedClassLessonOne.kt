package nestedclasses

/**
 * A nested class is created inside another class
 * The inner class can access variables and methods of the outer class using the 'this@FatherClassName'
 * The outer class can create an instance of the inner class
 *
 * All the changes I made inside the inner class with attributes from the outer class will affect the instances created
 *
 * I can understand this concept like this: an engine will only exist and its existence only means something if I have
 * a car. So following this line of logic I can assume that the engine is an inner piece from the car
 */

class CarNestedClassLessonOne {

    var speed = 100

    fun drive() {
        println("Driving at $speed")
    }

    inner class EngineNestedClassLessonOne {

        val rpm = 300

        fun run() {
            this@CarNestedClassLessonOne.speed = 150
            this@CarNestedClassLessonOne.drive()
            println("Engine running")
        }
    }
}

fun main() {

    val car = CarNestedClassLessonOne()

    println("Before calling the method inside the inner class")
    println(car.speed)
    car.drive()

    val engine = car.EngineNestedClassLessonOne()
    engine.run()

    println()

    println("After calling the method inside the inner class")
    println(car.speed)
    car.drive()
}