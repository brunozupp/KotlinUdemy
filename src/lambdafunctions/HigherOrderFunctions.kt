package lambdafunctions

/**
 * A Higher Order Function is a function that takes another function as a parameter
 */

fun main() {
    sayHello(
        listOf("Bruno", "Cassio", "Caio", "Fernando")
    ) { name ->
        println(name)
    }

    println()

    sayHello(
        listOf("Bruno 2", "Cassio 2", "Caio 2", "Fernando 2"),
        { name ->
            println(name)
        }
    )

    println()

    val modifiedNumbers = modifyEvenNumbers(
        listOf(10,11,12,13,14,15,16)
    ) { number -> number * 2 }

    println(modifiedNumbers)

    println()

    /**
     * IMPORTANT
     * I need to take care when creating a function with a mutable collection
     * because I can change its value inside the function I passed this collection,
     * and it will have its values changed in the memory
     */

    val originalNumbers = mutableListOf(1,2,3,4,5,6,7,8)

    val modifiedOriginalNumbers = modifyEvenNumbersTwo(
        originalNumbers
    ) { number -> number * 2 }

    println(modifiedOriginalNumbers)
    println(originalNumbers)

    println()

    val clients = listOf("Bruno", "Pedro", "Maria")

    val clientsPersonalized = modifyClientList(
        clients
    ) {
        "Hello, ${it.uppercase()}"
    }

    println(clientsPersonalized)
}

fun sayHello(names: List<String>, doSomething: (String) -> Unit) {
    for(name in names) {
        doSomething(name)
    }
}

fun modifyEvenNumbers(numbers: List<Int>, whenEvenNumber: (Int) -> Int) : List<Int> {
    val modifiedNumbers = mutableListOf<Int>()

    for(number in numbers) {
        if(number % 2 == 0) {
            modifiedNumbers.add(whenEvenNumber(number))
            continue
        }

        modifiedNumbers.add(number)
    }

    return modifiedNumbers
}

// Explanation of why I need to take care when using Mutable Collections as parameters is above
fun modifyEvenNumbersTwo(numbers: MutableList<Int>, whenEvenNumber: (Int) -> Int) : List<Int> {

    for(i in 0..<numbers.size) {
        val number = numbers[i]

        if(number % 2 == 0) {
            numbers[i] = whenEvenNumber(number)
        }
    }

    return numbers
}

fun modifyClientList(clients: List<String>, modifyClient: (String) -> String) : List<String> {

    val clientsPersonalized = mutableListOf<String>()

    for (client in clients) {
        clientsPersonalized.add(modifyClient(client))
    }

    return clientsPersonalized
}