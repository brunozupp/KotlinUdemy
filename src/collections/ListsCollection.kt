package collections

fun main() {

    // By default, List is immutable, so I can not add or remove elements to/from the list and
    // I can not edit any of the elements
    val numbersOne: List<Int> = listOf<Int>(1,2,3,4,5,6,1,2)
    println(numbersOne)

    // I can do all the actions above using a mutable version from the list
    val numbersTwo: MutableList<Int> = mutableListOf<Int>(1,2,3,4,5,6,1,2)
    numbersTwo.add(10)
    numbersTwo.remove(3)
    numbersTwo[0] = 99
    println(numbersTwo)

    // IMPORTANT: if I create an empty list I need to provide the type from the List

    val namesOne: MutableList<String?> = mutableListOf("bruno", null, null, "roberto", "paulo", null)

    println(namesOne)
    println(namesOne.filter { it != null })

    val requiredColors = listOf("red","blue","green")
    val availableColors = listOf("red","green")
    println("Can it print? -> ${availableColors.containsAll(requiredColors)}")
}