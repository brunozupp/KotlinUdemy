package generics

class BoxGenericsLessonOne<T>(
    private val items: MutableList<T>
) {

    fun add(item: T) = items.add(item)

    fun remove(item: T) = items.remove(item)

    fun findByIndex(index: Int) : T? {
        return items.getOrNull(index)
    }

    fun indexOf(item: T) : Int = items.indexOf(item)

    fun printAll() {
        println("Items in the box:")
        items.forEach(::println)
    }
}

fun main() {

    val box = BoxGenericsLessonOne<String>(mutableListOf())

    box.add("Bruno")
    box.add("Breno")
    box.add("Paty")

    box.printAll()

    println()

    box.remove("Breno")
    box.printAll()

    println()

    val valueFromIndexZero = box.findByIndex(0)
    println("Value from the index 0: $valueFromIndexZero")

    println()

    println("The index of the value Paty is: ${box.indexOf("Paty")}")
}