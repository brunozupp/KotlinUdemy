package dataclass

/**
 * In a Data Class I can make use of inheritance and interfaces
 * Inheritance has some limitations in this case, but I cover this topic in the DataClassLessonThree file
 */

abstract class DtoDataClassLessonTwo(
    open val id: String
) {
    abstract fun printInformation()
}

interface ContractDataClassLessonTwo {

    fun doSomething(text: String)
}

data class UserDataClassLessonTwo(
    override val id: String,
    val name: String,
    val email: String,
) : DtoDataClassLessonTwo(id), ContractDataClassLessonTwo {

    override fun printInformation() {
        println("Information about the class: $id | $name | $email")
    }

    override fun doSomething(text: String) {
        println(text)
    }
}

fun main() {

    val user = UserDataClassLessonTwo(
        "1",
        "Bruno",
        "email@email.com"
    )

    user.printInformation()
}