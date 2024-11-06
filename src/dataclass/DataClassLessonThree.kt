package dataclass

/**
 * In a Data Class I can make use of inheritance and interfaces
 */

abstract class DtoDataClassLessonThree(
    open val id: String
) {
    abstract fun printInformation()
}

interface ContractDataClassLessonThree {

    fun doSomething(text: String)
}

abstract class UserDataClassLessonThree(
    override val id: String,
    open val name: String,
    open val email: String,
) : DtoDataClassLessonThree(id), ContractDataClassLessonThree {

    override fun printInformation() {
        println("Information about the class: $id | $name | $email")
    }

    override fun doSomething(text: String) {
        println(text)
    }
}

/**
 * I can not inherit from another Data Class, just abstract and open classes
 * and Data Classes require that their attributes use val/var and to this I need
 * to 'open' all the attributes from the classes I am inheriting. And if I have
 * classes (open/abstract) with inherited attributes I need to put the override keyword
 * instead of 'open' keyword - as I did in the above abstract class UserDataClassLessonThree
 *
 * And I can override methods that was already override in other classes too
 */
data class AdminDataClassLessonThree(
    override val id: String,
    override val name: String,
    override val email: String,
    val levelPermission: Int,
) : UserDataClassLessonThree(id, name, email) {

    override fun printInformation() {
        println("Override again method printInformation() - $levelPermission")
    }
}

fun main() {

    val user = AdminDataClassLessonThree(
        "1",
        "Bruno",
        "email@email.com",
        4
    )

    user.printInformation()
}