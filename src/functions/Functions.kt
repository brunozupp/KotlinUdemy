package functions

fun main() {

    greeting("Bruno", "Hellooooooooo")

    // I have the option to use the name of parameters. But in order to use it I need to respect
    // the order, it means that after using it for the first time, all next parameters will need to
    // be named
    greeting(
        "bruno",
        message = "How are you?",
    )

    greeting(
        message = "How are you?",
        name = "bruno",
    )
}

// To return a value from the function I need to pass the type of returning
fun calculateAreaCircle(radius: Double): Double {
    return 3.1415 * radius * radius
}

// I can have default values to my parameters, so I don't need to provide it when using the function
fun greeting(
    name: String,
    message: String = "Good to see you",
) {
    println("Hello, $name. $message")
}

// Return shorthand
fun calculateAreaCircleWithTypeReturn(radius: Double): Double = 3.1415 * radius * radius

// In shorthand function I don't need to specify the type of returning
fun calculateAreaCircleWithoutTypeReturn(radius: Double) = 3.1415 * radius * radius

