package loops

fun main() {

    val animals = listOf("cat", "dog", "monkey", "mouse", "giraffe")

    for (animal: String in animals) {
        println(animal)
    }

    println()

    for(animal in animals) {
        println(animal)
    }

    println()

    // Looping through a range
    for(monthNumber in 1..12) {

        val month = when(monthNumber) {
            1 -> "january"
            2 -> "february"
            3 -> "march"
            4 -> "april"
            5 -> "may"
            6 -> "june"
            7 -> "july"
            8 -> "august"
            9 -> "september"
            10 -> "october"
            11 -> "november"
            12 -> "december"
            else -> "no month detected"
        }

        println(month)
    }

    println()

    for(i in 1..10) {
        println("Hello #$i")
    }

    println()

    val customers = mapOf(
        "Alice" to 24,
        "Judy" to 8,
        "Anna" to 6,
    )

    for (customer in customers) {
        println("${customer.key} bought ${customer.value} times")
    }

    println()

    for(counter in 10 downTo 0) {
        println(counter)
    }

    println()

    // It will have a range from 30 to 0 and will iterate skipping steps
    // in this case, it will be executed from 5 to 5 (down to in this case)
    for (counter in 30 downTo 0 step 5) {
        println(counter)
    }

    println()

    for(counter in 0..30 step 6) {
        println(counter)
    }

    println()

    // ----------------------------------------------------

    val names = listOf("bruno", "maria", "chris", "brenda")

    for (i in names.indices) {
        val name = names[i]
        println(name)
    }

    println()

    for(i in 0..<names.size) {
        val name = names[i]
        println(name)
    }

    println()

    // ----------------------------------------------------

    val numberChose = 79

    for(number in (numberChose - 1) downTo 1) {
        if(number % 7 == 0) {
            println(number)
        }
    }

    println()

    for (i in 1..10) {

        for(j in 1..i) {
            print("\uD83D\uDE00")
        }

        println()
    }

    println()

    val numberOfMatrix = 7
    for (i in 1..numberOfMatrix) {

        for(j in 1..numberOfMatrix) {

            val multiplication = i * j

            when(multiplication % 3) {
                0 -> print("\uD83D\uDE00")
                1 -> print("\uD83E\uDD28")
                2 -> print("\uD83D\uDE31")
            }
        }

        println()
    }
}