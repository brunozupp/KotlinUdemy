package whenconditional

import kotlin.random.Random

fun main() {

    /**
     * The 'when' keyword is the switch case from Kotlin
     * It can return a value
     */

    val animal = "cat"

    // val variables have the same behavior as the final variables in Dart
    // when the Scope from it is inside a function. So I can declare an immutable
    // variable and set its value later on
    val message: String

    // Switch Case
    when(animal) {
        "cat" -> {
            message = "The animal chose is cat"
        }
        "dog" -> {
            message = "The animal chose is dog"
        }
        "monkey" -> {
            message = "The animal chose is monkey"
        }
        else -> {
            message = "The animal chose is unknown"
        }
    }

    println(message)

    // ----------------------------------------------------

    // If I have the action in just one line I don't need the { } block
    when(4 % 2) {
        1 -> println("It's odd")
        0 -> println("It's even")
    }

    // ----------------------------------------------------

    // IMPORTANT: I can have nested when inside each option. But this is not
    // common to be seen as it leads to a more complex code

    // ----------------------------------------------------

    val randomNumber = Random.nextInt(0, 31)

    val messageToBePrintedOne = when(randomNumber) {
        in 0..10 -> "The number $randomNumber is between 0..10"
        in 11..20 -> "The number $randomNumber is between 11..20"
        else -> "The number $randomNumber is equal or greater than 21"
    }

    println("messageToBePrintedOne = $messageToBePrintedOne")

    val messageToBePrintedTwo = when {
        randomNumber in 0..10 -> "The number $randomNumber is between 0..10"
        randomNumber in 11..20 -> "The number $randomNumber is between 11..20"
        else -> "The number $randomNumber is equal or greater than 21"
    }

    println("messageToBePrintedTwo = $messageToBePrintedTwo")

    // ----------------------------------------------------

    // I can have more than 1 option returning the same value
    // In this case I need to separate the options using the ','

    val month = "january"

    val days = when(month) {
        "january", "march", "may" -> 31
        "february" -> 28
        else -> 30
    }

    println("The amount of days from $month is $days")

    // ----------------------------------------------------

    // Capturing the subject
    // It's possible to capture the value in a when statement
    // and use it in the block

    val name = "Michelle"

    when(val length = name.length) {
        in 1..5 -> println("A name with $length characters is short")
        in 6..10 -> println("A name with $length characters is medium")
        else -> println("A name with $length characters is long")
    }

    val hour = 5

    when(hour) {
        in 6..11 -> println("morning")
        in 12..14 -> println("noon")
        in 15..17 -> println("afternoon")
        in 18..21 -> println("evening")
        else -> println("night")
    }
}