package operations

fun main() {

    /**
     * The type of the result of an operation is the same as the type of the largest operand in
     * terms of size in memory
     * Byte < Short < Int < Long < Float < Double
     *
     * Example: If I sum an integer and a double, the result will be from type double
     */

    val sum = 5 + 4.0

    println(sum::class.java) // double
}