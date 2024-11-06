package nullability

fun main() {

    var name: String? = null

    println(name?.length)

    name = "Bruno"

    println(name?.length)
    println(name.length)

    println(sum(2,5))

    val number: Int? = null

    println(number?.plus(4))
    println(number?.minus(2))
    println(number?.times(5))
    println(number?.div(2))
    println(number?.mod(2))
}

fun sum(valueOne: Int?, valueTwo: Int?) : Int {

    if(valueOne == null || valueTwo == null) {
        return 0
    }

    // The analyzer gives me the auto promotion of type from nullable
    // to not nullable when checking if the variable is null before using it
    // that is why the analyzer gives me advice to erase the !! from the variables below
    return valueOne!! + valueTwo!!
}