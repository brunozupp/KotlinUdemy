package enumclasses

/**
 * I can have attributes passed to my enum.
 * And I can have functions inside my enum as well.
 */
enum class RolesEnumLessonOne(val positionNumber: Int) {
    NORMAL(23),
    ADMIN(45),
    MANAGER(12);

    fun askPermission() {

        if(this == ADMIN) {
            println("Permission granted!")
        } else {
            println("Permission not granted!")
        }
    }
}

fun main() {

    val admin = RolesEnumLessonOne.ADMIN

    println("The position from the admin in the system is $admin")

    admin.askPermission()
}
