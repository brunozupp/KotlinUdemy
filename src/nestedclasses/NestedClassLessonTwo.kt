package nestedclasses

/**
 * To make the implementation of the inner class hidden I can put the private keyword and create an instance of this
 * class inside the outer class. And when creating the instance of the inner class I need to make my attribute private
 */
class CarNestedClassLessonTwo {

    private val engine = EngineNestedClassLessonTwo()

    var speed = 100

    fun drive() {
        println("Driving at $speed")
    }

    fun run() = engine.run()

    private inner class EngineNestedClassLessonTwo{

        val rpm = 300

        fun run() {
            this@CarNestedClassLessonTwo.speed = 150
            this@CarNestedClassLessonTwo.drive()
            println("Engine running")
        }
    }
}

fun main() {

    val car = CarNestedClassLessonTwo()

    println("Before calling the method inside the inner class")
    println(car.speed)
    car.drive()

    car.run()

    println()

    println("After calling the method inside the inner class")
    println(car.speed)
    car.drive()
}