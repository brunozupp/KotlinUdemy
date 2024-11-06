package sealedclasses

import kotlin.random.Random

/**
 * Just to remember: object constructor is similar to a class, but it makes this 'class' static, so I don't initialize
 * it.
 * And when I try to read the instance in a println it will give me all the path from this object + name of the object
 * + the number in the memory from its reference. All of this is the String Representation from the object.
 * Example below:
 * sealedclasses.HomeStateSealedLessonTwo$HomeLoadingSealedLessonTwo@6442b0a6
 * And since objects are singletons in Kotlin, the address part will remain the same each time we print that object and
 * is not relevant to us.
 *
 * And just like class has the concept of Data Class, object has this concept too. It is the Data Object
 * The difference between an object and a data object is that the last one reads just the name when call it in the
 * println, for example. So the toString() from data object brings to me just the name of the object and not everything
 * as shown above when using just object
 *
 * The solution of Data Object appeared from the need to avoid removing the need to override the .toString() manually,
 * and aligning behavior with a Data Class definition.
 */

/**
 * Using Data type constructors to handle sealed class's children is a standard.
 * So if I have attribute, I use the Data Class and if I have just the representation (no attribute) I use the Data Object
 */
sealed class HomeStateSealedLessonTwo {

    data class HomeSuccessSealedLessonTwo(val animals: List<String>) : HomeStateSealedLessonTwo()

    data class HomeErrorSealedLessonTwo(val message: String): HomeStateSealedLessonTwo()

    data object HomeLoadingSealedLessonTwo : HomeStateSealedLessonTwo()
}

fun main() {

    val state: HomeStateSealedLessonTwo = getStateHomeSealedLessonTwo()

    when(state) {
        is HomeStateSealedLessonTwo.HomeErrorSealedLessonTwo -> {
            println("Error")
            println(state.message)
        }
        is HomeStateSealedLessonTwo.HomeLoadingSealedLessonTwo -> {
            println("Loading")
        }
        is HomeStateSealedLessonTwo.HomeSuccessSealedLessonTwo -> {
            println("Success")
            println(state.animals)
        }
    }

    println()

    println("Logging: $state")
}

fun getStateHomeSealedLessonTwo() : HomeStateSealedLessonTwo {

    val number = Random.nextInt(0,3)

    return when(number) {
        0 -> HomeStateSealedLessonTwo.HomeLoadingSealedLessonTwo
        1 -> HomeStateSealedLessonTwo.HomeErrorSealedLessonTwo("Error occurred")
        else -> HomeStateSealedLessonTwo.HomeSuccessSealedLessonTwo(listOf("cat", "dog"))
    }
}

