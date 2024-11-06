package lambdafunctions

fun main() {

    val clients = listOf("Bruno", "Marcos", "Pedro", "Joao Antonio", "Maria", "Leo", "Bia")

    println(
        clients.filter { it.length >= 5 }
    )

    println(
        clients.map { it.uppercase() }
    )

    println(
        clients.firstOrNull { it.lowercase().contains("bru") }
    )

    println(
        clients.sortedBy { it.length }
    )

    println(
        clients.sortedBy { it[0] }
    )

    println(
        clients.maxBy { it.length }
    )

    println(
        clients.minBy { it.length }
    )

    println(
        listOf(1,4,6,10,99,100,45,67,23,134,567,3456,44356)
            .filter { it in 10..99 }
    )

    println("Sorted by the last letter from the clients name")

    println(
        clients.sortedBy { it[it.length - 1] }
    )

    println(
        listOf(150,250,540,670,234)
            .maxBy { it.toString()[1].digitToInt() }
    )

    val listOfExercise = listOf(1,4,6,10,99,100,45,67,23,134,567,3456,44356)

    println(
        listOfExercise.map {
            if(it % 2 == 0) it * 2 else it / 2
        }
    )

    println(listOfExercise.filter { it > 25 })
}