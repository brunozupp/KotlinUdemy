package novelitech.game.tictactoe

val board: MutableList<MutableList<Char>> = mutableListOf()

const val BLANK = ' '
const val PLAYER_X = 'X'
const val PLAYER_O = 'O'

var currentPlayer: Char = PLAYER_X
var counter = 0

fun main() {
    initBoard()

    while (counter < 9) {

        counter++

        setUpBoardGame()
        askPosition()

        if(verifyWinner(currentPlayer)) {
            println()
            println("The WINNER is the player $currentPlayer")
            printBoard()
            break
        } else if(counter == 9) {
            println("There is no winner")
        } else {
            changePlayer()
        }

        println("\n-----------------------------------\n")
    }
}

fun setUpBoardGame() {
    println("The current board is like this:")
    printBoard()
    println()
}

fun initBoard() {

    for (i in 0..2) {

        board.add(mutableListOf())

        for (j in 0..2) {
            board[i].add(BLANK)
        }
    }
}

fun printBoard() {

    for (i in 0..<board.size) {
        for (j in 0..<board.size) {

            if(j == 1) {
                print("|")
            }

            print(board[i][j])

            if(j == 1) {
                print("|")
            }
        }
        println()
        if(i != 2) {
            println("-----")
        }

    }
}

fun changePlayer() {
    currentPlayer = if(currentPlayer == PLAYER_O) {
        PLAYER_X
    } else {
        PLAYER_O
    }
}

fun printBoardHelper() {
    println("${printNumberOrSquare(0)}|${printNumberOrSquare(1)}|${printNumberOrSquare(2)}")
    println("-----")
    println("${printNumberOrSquare(3)}|${printNumberOrSquare(4)}|${printNumberOrSquare(5)}")
    println("-----")
    println("${printNumberOrSquare(6)}|${printNumberOrSquare(7)}|${printNumberOrSquare(8)}")
}

fun printNumberOrSquare(position: Int): String {
    return if (isPositionAvailable(position)) "$position" else "⏹"
}

fun askPosition() {

    println("Look to the board position to enter a valid value")
    printBoardHelper()
    println()
    print("Enter a position to do a play ($currentPlayer): ")

    try {

        val typed = readlnOrNull()

        if(typed.isNullOrBlank() || typed.length > 1 || !typed[0].isDigit()) {
            println("You entered the wrong position. Try Again")
            askPosition()
            return
        }
        val position = typed.toInt()

        if(isPositionAvailable(position)) {
            markPositionInBoard(position)
        } else {
            println("This position is not available. Try another one")
            askPosition()
            return
        }

    } catch(e: Exception) {
        println(e)
        println(e.stackTraceToString())
        println("Something went wrong. Try Again")
        askPosition()
        return
    }
}

fun isPositionAvailable(position: Int) : Boolean {

//    if(position == 0) {
//        return board[0][0] == BLANK
//    }
//
//    if(position == 1) {
//        return board[0][1] == BLANK
//    }
//
//    if(position == 2) {
//        return board[0][2] == BLANK
//    }
//
//    if(position == 3) {
//        return board[1][0] == BLANK
//    }
//
//    if(position == 4) {
//        return board[1][1] == BLANK
//    }
//
//    if(position == 5) {
//        return board[1][2] == BLANK
//    }
//
//    if(position == 6) {
//        return board[2][0] == BLANK
//    }
//
//    if(position == 7) {
//        return board[2][1] == BLANK
//    }
//
//    if(position == 8) {
//        return board[2][2] == BLANK
//    }
//
//    return false

    return when(position) {
        0 -> board[0][0] == BLANK
        1 -> board[0][1] == BLANK
        2 -> board[0][2] == BLANK
        3 -> board[1][0] == BLANK
        4 -> board[1][1] == BLANK
        5 -> board[1][2] == BLANK
        6 -> board[2][0] == BLANK
        7 -> board[2][1] == BLANK
        else -> board[2][2] == BLANK
    }
}

fun markPositionInBoard(position: Int) {

    /**
     * This solution will work too.
     * If I try the solution with If Else nested it will work too,
     * but I CAN NOT use the else part of this block as it would give me
     * an error (the same error I described below)
     */
//    if(position == 0) {
//        board[0][0] = currentPlayer
//        return
//    }
//
//    if(position == 1) {
//        board[0][1] = currentPlayer
//        return
//    }
//
//    if(position == 2) {
//        board[0][2] = currentPlayer
//        return
//    }
//
//    if(position == 3) {
//        board[1][0] = currentPlayer
//        return
//    }
//
//    if(position == 4) {
//        board[1][1] = currentPlayer
//        return
//    }
//
//    if(position == 5) {
//        board[1][2] = currentPlayer
//        return
//    }
//
//    if(position == 6) {
//        board[2][0] = currentPlayer
//        return
//    }
//
//    if(position == 7) {
//        board[2][1] = currentPlayer
//        return
//    }
//
//    if(position == 8) {
//        board[2][2] = currentPlayer
//        return
//    }

    /**
     * If I declare the else in the place of the 8 I have an error
     * java.lang.ClassCastException: class java.lang.Character cannot be cast to class kotlin.Unit
     */
    when(position) {
        0 -> board[0][0] = currentPlayer
        1 -> board[0][1] = currentPlayer
        2 -> board[0][2] = currentPlayer
        3 -> board[1][0] = currentPlayer
        4 -> board[1][1] = currentPlayer
        5 -> board[1][2] = currentPlayer
        6 -> board[2][0] = currentPlayer
        7 -> board[2][1] = currentPlayer
        8 -> board[2][2] = currentPlayer
    }
}

fun verifyWinner(currentPlayer: Char) : Boolean {

    // Horizontal
    if(board[0][0] == currentPlayer && board[0][1] == currentPlayer && board[0][2] == currentPlayer) {
        return true
    }

    if(board[1][0] == currentPlayer && board[1][1] == currentPlayer && board[1][2] == currentPlayer) {
        return true
    }

    if(board[2][0] == currentPlayer && board[2][1] == currentPlayer && board[2][2] == currentPlayer) {
        return true
    }

    // Vertical
    if(board[0][0] == currentPlayer && board[1][0] == currentPlayer && board[2][0] == currentPlayer) {
        return true
    }

    if(board[0][1] == currentPlayer && board[1][1] == currentPlayer && board[2][1] == currentPlayer) {
        return true
    }

    if(board[0][2] == currentPlayer && board[1][2] == currentPlayer && board[2][2] == currentPlayer) {
        return true
    }

    // Diagonal
    if(board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
        return true
    }

    if(board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
        return true
    }

    return false
}