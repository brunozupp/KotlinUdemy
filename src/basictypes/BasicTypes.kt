package basictypes

fun main() {

    // Characters -----------------------------------------

    val stringTypeOne: String = "String type"
    val stringTypeTwo = "String type"

    val charTypeOne: Char = 'A'
    val charTypeTwo = 'A'

    // Numbers - whole numbers ----------------------------

    val byteTypeOne: Byte = 5
    // If I don't use an explicit type or conversion the analyzer will
    // assign the type int to this variable
    val byteTypeTwo = 4.toByte()

    val shortTypeOne: Short = 4
    val shortTypeTwo = 4.toShort()

    val intTypeOne: Int = 5
    val intTypeTwo = 5

    val longTypeOne: Long = 19
    val longTypeTwo = 19L

    // Numbers - decimal numbers --------------------------

    val doubleTypeOne: Double = 3.5
    val doubleTypeTwo = 3.5

    val floatTypeOne: Float = 5.4F
    val floatTypeTwo = 5.4F

    // Boolean --------------------------------------------

    val booleanOne: Boolean = true
    val booleanTwo = true

    /**
     * var vs val
     * var = mutable
     * val = immutable
     */

    val stringTemplate = "The value of stringTypeOne is $stringTypeOne"
    println(stringTemplate)

    println("The sum of intType One and Two is = ${intTypeOne + intTypeTwo}")

    // It will give me the type of this variable
    println(stringTypeTwo::class.java)
}