package standardfunctions

/**
 * Used for performing some additional actions on an object
 * Common use case is adding some actions that don't affect the object such as logging or debugging information
 * Removing an "also block" should not affect the execution of a program
 * I have access to the object using the 'it'
 */
fun main() {

    val car = CarStandardFunctionAlsoLessonOne()
        .apply {
            name = "fusca"
            price = 234.54
            startEngine()
        }
        .also {
            println(it)
            println("The object was created ${it.name}")
        }
}

class CarStandardFunctionAlsoLessonOne {

    var name: String? = null
    var price: Double? = null

    fun startEngine() {
        println("Start engine")
    }

    override fun toString(): String {
        return "name: $name | price: $price"
    }
}