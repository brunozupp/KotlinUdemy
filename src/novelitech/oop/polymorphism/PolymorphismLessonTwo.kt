package com.novelitech.oop.polymorphism

/**
 * Polymorphism works with companion object too
 */
class MyMathPolymorphismLessonTwo {

    companion object {
        fun sum(n1: Double, n2: Double) : Double {
            return n1 + n2
        }

        fun sum(n1: Double, n2: Double, n3: Double) : Double {
            return n1 + n2 + n3
        }

        fun sum(n1: Double, n2: Double, n3: Double, n4: Double) : Double {
            return n1 + n2 + n3 + n4
        }

        fun sum(n1: Int, n2: Int) : Int {
            return n1 + n2
        }

        fun sum(n1: Int, n2: Int, n3: Int) : Int {
            return n1 + n2 + n3
        }

        fun sum(n1: Int, n2: Int, n3: Int, n4: Int) : Int {
            return n1 + n2 + n3 + n4
        }
    }
}

fun main() {

    val resultOne = MyMathPolymorphismLessonTwo.sum(1,2,3)

    val resultTwo = MyMathPolymorphismLessonTwo.sum(23.4,52.3)
}