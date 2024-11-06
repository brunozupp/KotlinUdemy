package standardfunctions

/**
 * With is similar to the Let
 * Perform a block of code on an object
 * The context is available as 'this' (the 'this' keyword can be omitted)
 * Can access object variables and methods
 * Typical use case:
 * - perform some initialization on an object
 * - perform a sequence of actions on an object
 */
fun main() {

    val carOne = CarStandardFunctionWithLessonOne(
        "Fusca",
        234.54,
    )

    with(carOne) {
        println("Car info: $this")
        mergeName(" merge same text")
        println("Car info: $this")
        name = "New name"
        println("Car info: $this")
        this.name = "Using this (what is not necessary)"
        println("Car info: $this")
        startEngine()
        turnOffEngine()
    }

    println("\n--------------------------\n")

    var carNullable: CarStandardFunctionWithLessonOne? = null

    with(carNullable) {
        if(carNullable == null) {
            println("This car is null")
        } else {
            println("This car is not null")
        }

        println()

        // I can not do this because I can just change the attributes inside an object, and trying this I am
        // change the reference from the object
        // this = CarStandardFunctionWithLessonOne("df", 452.34)

        // And even if I try this, which the IDEA will permit, not causing an error, when I run the loop below it will
        // display null. This is because I am using the 'this' reference to the object. So it is appointing to the
        // space in memory where the value of carNullable is null
        // If I put the variable itself instead of $this in the println it would show the current value as it was
        // assigned in the line below
        carNullable = CarStandardFunctionWithLessonOne("df", 452.34)

        for (i in 0..2) {
            println("Repeating $i = $this")
        }
    }

    println("Reading carNullable outside the with = $carNullable")
}

class CarStandardFunctionWithLessonOne(
    var name: String,
    val price: Double,
) {

    fun startEngine() {
        println("Starting the engine")
    }

    fun turnOffEngine() {
        println("Turning off the engine")
    }

    fun mergeName(textToMerge: String) {
        name += textToMerge
    }

    override fun toString(): String {
        return "Name: $name | Price: $price"
    }
}