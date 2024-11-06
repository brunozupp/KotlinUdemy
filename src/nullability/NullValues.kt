package nullability

fun main() {

    val stringNotNull: String = "Bruno"

    // I need to assign with null here because If I don't the analyzer will give an error
    // in the println
    var stringNullable: String? = null

    println(stringNullable)

    stringNullable = "New"
    stringNullable = null
}