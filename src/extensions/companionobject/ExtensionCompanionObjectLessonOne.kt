package extensions.companionobject

/**
 * If a class has a companion object defined, we can extend it with functions and properties
 * If not, we cannot add a companion object
 */

class BookExtensionCompanionObjectLessonOne {

    companion object { }
}

fun BookExtensionCompanionObjectLessonOne.Companion.printBookPercyJackson() {
    println("The book is from Percy Jackson")
}

fun BookExtensionCompanionObjectLessonOne.Companion.rateBook(book: String) : Int {
    return 3
}

val BookExtensionCompanionObjectLessonOne.Companion.favoriteBook: String
    get() = "Percy Jackson"


fun main() {

    BookExtensionCompanionObjectLessonOne.printBookPercyJackson()

    println("The rating is: ${BookExtensionCompanionObjectLessonOne.rateBook("Percy Jackson")}")

    println("My favorite book is: ${BookExtensionCompanionObjectLessonOne.favoriteBook}")
}