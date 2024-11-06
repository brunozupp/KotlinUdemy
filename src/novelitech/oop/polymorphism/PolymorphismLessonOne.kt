package com.novelitech.oop.polymorphism

/**
 * When talking about Polymorphism I have two types:
 * - Dynamic -> method overriding
 * - Static -> method overloading
 *
 * Dynamic - it's the override of methods that are marked as open in superclasses. It is used in inheritance when I want
 * to override methods inside the base classes
 *
 * Static -> it's the example I did in this file. I have functions with the same name, but with different assignments
 * These different assignments can be parameters (amount and type of these parameters) and type returning
 */
class MyMathPolymorphismLessonOne {

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

fun main() {

    val math = MyMathPolymorphismLessonOne()

    val resultOne = math.sum(1,2,3)

    val resultTwo = math.sum(23.4,52.3)
}