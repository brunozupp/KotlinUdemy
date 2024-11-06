package enumclasses

/**
 * Define a collection of constants
 * The constants defined are objects
 * The constants have properties
 */

enum class ColorsEnumLessonOne {
    RED,
    GREEN,
    BLUE,
}

fun main() {

    val color = ColorsEnumLessonOne.BLUE

    makePhraseWithColor(color)

    // Ordinal represents the index of this constant inside the enum class
    println("Name: ${color.name} | Ordinal: ${color.ordinal}")

    ColorsEnumLessonOne.entries.forEach(::println)

    if(color == ColorsEnumLessonOne.BLUE) {
        println("This is BLUE")
    }

    // It returns an exception if the value doesn't exist
    val greenFromString = ColorsEnumLessonOne.valueOf("GREEN")
    println(greenFromString)
}

fun makePhraseWithColor(color: ColorsEnumLessonOne) {
    when(color) {
        ColorsEnumLessonOne.RED -> println("Something is RED")
        ColorsEnumLessonOne.GREEN -> println("Something is GREEN")
        ColorsEnumLessonOne.BLUE -> println("Something is BLUE")
    }
}