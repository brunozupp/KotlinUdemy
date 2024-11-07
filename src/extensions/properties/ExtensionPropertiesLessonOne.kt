package extensions.properties

/**
 * Can add properties do classes, in a similar way to functions.
 * They cannot be local, i.e. declared inside a function or a class. It must be as I did here (like a global function/property)
 * It cannot update an extension property . It can only use values (val), not variables (var)
 *
 * Different from the Extension in Functions, I can not pass any parameter, so it limits what I can do
 * Inside the implementation I have the access to the properties and methods from the object when I am inside implementation
 * from the extension property. In this case I can use it to achieve what I intend, as I did in the second and third
 * methods
 */

val String.constPhrase: String
    get() = "This is a constant phrase"

val String.messageWithLength: String
    get() {
        val length = length
        return "This is a message with length of the string: $length"
    }

val String.countVowels: Int
    get() {
        var counter = 0

        val vowels = listOf("a", "e", "i", "o", "u")

        val lowercaseString = lowercase()

        // I don't need to put the 'this' to access the methods/attributes
        // That's why I can access the attribute 'indices' like this
        for (i in indices) {

            if(vowels.contains(lowercaseString[i].toString())) {
                counter++
            }
        }

        return counter
    }

fun main() {

    val name = "Bruno Noveli"

    println(name.constPhrase)

    println(name.messageWithLength)

    println("The number of vowels in the string is: ${name.countVowels}")
}