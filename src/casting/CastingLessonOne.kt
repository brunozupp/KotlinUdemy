package casting

/**
 * Null safe operator as?
 * It will return the value casted to the type I want or will return null if it's impossible to cast the type
 */

open class Car { }

class BMW : Car() {

    fun drive() {
        println("Drive")
    }
}

fun main() {

    val value = getCar()

    val bmw = value as? BMW
    bmw?.drive()
}

fun getCar() : Car {
    return BMW()
//    return Car()
}
