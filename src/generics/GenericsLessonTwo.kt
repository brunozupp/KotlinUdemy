package generics

/**
 * I can restrict the types my generics can accept
 */

abstract class FruitGenericsLessonTwo(
    val scientificName: String,
    val averageWeight: Double,
    val isSweet: Boolean,
)

class AppleGenericsLessonTwo : FruitGenericsLessonTwo("Apple scientific",10.0,true)

class OrangeGenericsLessonTwo: FruitGenericsLessonTwo("Orange scientific",4.5,true)

class MelonGenericsLessonTwo: FruitGenericsLessonTwo("Melon scientific",3.4,false)

class BoxGenericsLessonTwo<T : FruitGenericsLessonTwo> {

    private val fruits = mutableListOf<T>()

    fun add(item: T) = fruits.add(item)

    fun remove() = fruits.removeFirstOrNull()

    fun printAll() {
        println("Fruits in the box:")
        fruits.forEach(::println)
    }
}

fun main() {

    val apples = BoxGenericsLessonTwo<AppleGenericsLessonTwo>()

    for (i in 1..5) {
        apples.add(AppleGenericsLessonTwo())
    }

    apples.printAll()
}