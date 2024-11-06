package dataclass

/**
 * In a Data Class the comparison is made using the values, not the reference in memory like it's done with normal
 * classes.
 *
 * And another method that was already tested is the .toString()
 *      - Normal classes print the memory reference
 *      - Data classes print the values of the attributes
 */
data class UserDataClassLessonFour(
    val id: String,
    val name: String,
    val email: String,
)

class AdminDataClassLessonFour(
    val id: String,
    val name: String,
    val email: String,
)

fun main() {

    val userOne = buildUser()
    val userTwo = buildUser()

    // Compare using the values
    println("The comparison between DATA CLASSES when they have the same values in the " +
            "attributes: ${userOne == userTwo}")



    println("\n----------------------------\n")

    val adminOne = buildAdmin()
    val adminTwo = buildAdmin()

    // Compare using the memory reference
    println("The comparison between NORMAL CLASSES when they have the same values in the " +
            "attributes: ${adminOne == adminTwo}")


}

fun buildUser() : UserDataClassLessonFour = UserDataClassLessonFour(
    id = "1",
    name = "Bruno",
    email = "email@email.com",
)

fun buildAdmin() : AdminDataClassLessonFour = AdminDataClassLessonFour(
    id = "2",
    name = "Rafa",
    email = "admin@admin.com",
)