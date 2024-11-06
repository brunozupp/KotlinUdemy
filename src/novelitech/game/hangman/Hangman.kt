package novelitech.game.hangman

import kotlin.random.Random

const val TOTAL_AMOUNT_OF_MISTAKES = 6
const val NUMBER_OF_DASHES = 10

val words = listOf("show","jeans","wild","attempt","wax","banana").map { it.uppercase() }
var word = ""
val guesses = mutableListOf<Char>()
var remainingGuesses = 10
var mistakes = 0
var round = 1

var gameOver = false

fun main() {
    startGame()
}

fun startGame() {
    setUpGame()

    while (!gameOver && remainingGuesses > 0 && mistakes < 6) {
        setRound()
        println("\n------------------------------------------------\n")
    }

    if(remainingGuesses == 0 || mistakes == 6) {

        if(mistakes == 6) {
            println("Oh no. The man's just died :(")
            printBodyAndGallows()
        }

        if (remainingGuesses == 0) {
            println("You used all your chances. YOU LOST")
        }
    }
}

fun setUpGame() {

    val worldIndex = Random.nextInt(words.size)
    word = words[worldIndex]

    println("The word chose is: $word")

    remainingGuesses = word.length + 7
    mistakes = 0
    round = 1
    guesses.clear()
}

fun setRound() {
    printInformationAboutCurrentRound()

    println()

    val letter = askForLetter().uppercase()[0]

    println()

    println("You chose $letter")
    guesses.add(letter)

    with(word.toList()) {
        if(contains(letter)) {
            println("Congratulations!!! You've got it right. The letter $letter is correct :)")
        } else {
            mistakes++
            println("Oh no! You chose the wrong letter :(")
        }
    }

    val containsAllLettersFromWord = guesses.containsAll(word.toList())

    if(containsAllLettersFromWord) {
        println("YOU WON THE GAME. The word was $word")
        gameOver = true
        remainingGuesses--
    } else {
        remainingGuesses--
    }
}

fun askForLetter() : Char {

    try {

        print("Enter a letter: ")
        val letter = readlnOrNull()

        if(
            letter.isNullOrBlank() ||
            letter.length > 1 ||
            !letter.all { it.isLetter() }
        ) {
            println("You didn't typed a letter. Please, try again!")

            return askForLetter()
        }

        if(guesses.contains(letter.uppercase()[0])) {
            println("You have already typed the letter ${letter.uppercase()}")

            return askForLetter()
        }

        return letter[0]

    } catch(e: Exception) {
        println("Something went wrong. Please, try again!")

        return askForLetter()
    }
}

fun printInformationAboutCurrentRound() {
    println("Round: $round")
    println("Remaining guesses: $remainingGuesses")
    println("Mistakes: $mistakes -> ($TOTAL_AMOUNT_OF_MISTAKES/${TOTAL_AMOUNT_OF_MISTAKES - mistakes})")

    println("Letters chose -> ${guesses.joinToString(" ")}")

    val lettersToBeChosen = getAlphabet()
    lettersToBeChosen.removeAll(guesses)
    println("Letters to be chosen: ${lettersToBeChosen.joinToString(" ")}")

    print("Word: ")
    printLettersGuessedFromWord()
    println("\nThis is the current state of the hangman:")
    printBodyAndGallows()
}

fun printBody(mistakes: Int) {

    var space = ""

    for (i in 1..(NUMBER_OF_DASHES - 2)) {
        space += " "
    }

    // Head
    if(mistakes >= 1) {
        print(space)
        println(" O")
    }

    //print(space)

    // Superior Body
    if(mistakes >= 2) {
        print(space)
        if(mistakes >= 4) {
            println("/|\\")
        } else if(mistakes >= 3) {
            println("/|")
        } else {
            println(" |")
        }
    }

    if(mistakes == 5) {
        print(space)
        println("/ ")
    }

    if(mistakes == 6) {
        print(space)
        println("/ \\")
    }
}

fun printGallows() {

    var dashes = ""
    var rope = ""

    for (i in 1..NUMBER_OF_DASHES) {

        dashes += "_"

        rope += if(i == NUMBER_OF_DASHES) "|" else " "
    }

    println(dashes)
    println(rope)
}

fun printBodyAndGallows() {
    printGallows()
    printBody(mistakes)
}

fun printLettersGuessedFromWord() {

    val squares = mutableListOf<Char>()

    val guessesCorrected = mutableListOf<Char>()
    guessesCorrected.addAll(guesses)

    //guessesCorrected.removeAll { !word.uppercase().toList().contains(it) }

    for (i in word.indices) {

        val letter = word[i]

        if(!guessesCorrected.contains(letter)) {
            squares.add('⏹')
        } else {
            squares.add(letter)
        }
    }

    println(squares.joinToString(" "))
}

fun getAlphabet() : MutableList<Char> {

    val alphabet = mutableListOf<Char>()

    var letterAlphabet = 'A'

    while (letterAlphabet <= 'Z') {
        alphabet.add(letterAlphabet)
        letterAlphabet++
    }

    return alphabet
}