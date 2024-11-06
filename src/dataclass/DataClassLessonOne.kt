package dataclass

/**
 * Commonly create classes just for storing data
 * Primary constructor has at least one parameter
 * All primary constructor parameters need to be val or var
 *      The most used is val because the main work of a data class is store data, just it
 * Can have a body but not required
 * It gives me the method .copy by default
 *
 * It's used to create the DTOs classes
 */

data class UserDataClassLessonOne(
    val id: String,
    val name: String,
    val email: String,
)

fun main() {

    val user = UserDataClassLessonOne(
        "1",
        "Bruno",
        "email@email.com"
    )

    // When using the object in the print method it will give me the values and not the memory reference like it does
    // when I use a simple class
    println(user)

    // I can use the method .copy by default when using a data class
    val userCopy = user.copy(
        name = "Sergio"
    )

    println(userCopy)
}