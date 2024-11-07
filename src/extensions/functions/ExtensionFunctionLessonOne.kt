package extensions.functions

/**
 * Can add functions to a class that we don't own or can not modify
 * Can access the object using the 'this' reference
 *
 * I can have overload methods as well
 *
 * Important points:
 * The original class is not actually modified
 * The new functions are not actually inserted in the class
 * Rather, it's a shortcut to make the functions available using the usual object.function notation
 */

fun String.greetingLessonOne() = "It's nice to meet you, $this"

// Overload method is available
fun String.greetingLessonOne(greeting: String) = "$greeting, $this"

// I can return other types from the type I am extending
fun String.countVowels() : Int {

    var counter = 0

    val vowels = listOf("a", "e", "i", "o", "u")

    val lowercaseString = lowercase()

    // I don't need to put the 'this' to access the methods/attributes
    // That's why I can access the attribute 'indices' like this
    for (i in indices) {

        if(vowels.contains(lowercaseString[i].toString())) {
            counter++
        }
    }

    return counter
}

fun main() {

    val name = "Bruno"

    println(name.greetingLessonOne())

    println(name.greetingLessonOne("Personalized greeting"))

    println("The number os vowels in the string $name is ${name.countVowels()}")
}