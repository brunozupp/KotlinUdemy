package sealedclasses

import kotlin.random.Random

/**
 * Define a restricted hierarchy
 * Abstract by default so cannot be instantiated
 * Useful in when expressions
 *
 * One case of use is if I am applying the state of my screen as a class/state, so I define a sealed class to abstract
 * and typing my reactive variable and make other classes inherit from it to add specific states from my screen.
 * - Bloc pattern
 *
 * I can inherit an abstract class in a sealed class, as sealed class is basically an abstract class
 */

sealed class StandardStateSealedLessonOne

// I can inherit from another sealed class
sealed class HomeStateSealedLessonOne : StandardStateSealedLessonOne()

class HomeLoadingSealedLessonOne : HomeStateSealedLessonOne()

class HomeErrorSealedLessonOne(val message: String) : HomeStateSealedLessonOne()

class HomeSuccessSealedLessonOne(val animals: List<String>) : HomeStateSealedLessonOne()

fun main() {

    val state: HomeStateSealedLessonOne = getStateHome()

    when(state) {
        is HomeErrorSealedLessonOne -> {
            println("Error")
            println(state.message)
        }
        is HomeLoadingSealedLessonOne -> {
            println("Loading")
        }
        is HomeSuccessSealedLessonOne -> {
            println("Success")
            println(state.animals)
        }
    }
}

fun getStateHome() : HomeStateSealedLessonOne {

    val number = Random.nextInt(0,3)

    return when(number) {
        0 -> HomeLoadingSealedLessonOne()
        1 -> HomeErrorSealedLessonOne("Error occurred")
        else -> HomeSuccessSealedLessonOne(listOf("cat", "dog"))
    }
}

