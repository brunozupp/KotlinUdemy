package com.novelitech.oop.scope.lessonone

import com.novelitech.oop.scope.helperlessonone.BirdScopeLessonOne

/**
 * Modifiers:
 * private - visible inside the class only
 * protected - visible inside class and inheriting classes
 * internal - visible inside package
 * public - visible to anyone accessing the class
 *
 * Default is public
 *
 * This all is related with Encapsulation, where it is the principle of hiding internal workings of a class and
 * only show what the others classes need
 */

open class AnimalScopeLessonOne(
    private val name: String,
    protected val weight: Double,
    internal val isBird: Boolean,
    public val isVegetarian: Boolean, // public is default, so I don't need to write down this
) {

    private fun soundPrivate() {
        println("Sound Private")
    }

    protected fun soundProtected() {
        println("Sound rotected")
    }

    internal fun soundInternal() {
        println("Sound Internal")
    }

    public fun soundPublic() {
        println("Sound Public")
    }
}

class MonkeyScopeLessonOne(
    name: String,
    weight: Double,
    isBird: Boolean,
    isVegetarian: Boolean, // public is default, so I don't need to write down this
) : AnimalScopeLessonOne(
    name,
    weight,
    isBird,
    isVegetarian,
) {

    fun callProtectedAttribute() {
        println(weight)
    }

    /**
     * I can not call private methods
     */
    fun callMethodsFromFather() {
        soundProtected()
        soundInternal()
        soundPublic()
    }

    /**
     * I can not call private attributes
     */
    fun callAttributesFromFather() {
        println(weight)
        println(isBird)
        println(isVegetarian)
    }
}

fun main() {

    val monkey = MonkeyScopeLessonOne("name", 245.23, isBird = true, isVegetarian = true)

    // protected methods are just visible inside the father class and children classes
    // protected attributes are just visible inside the father class and children classes
    // The only way to access them is to create methods to give me access
    monkey.soundPublic()
    monkey.soundInternal()
    println(monkey.isBird)
    println(monkey.isVegetarian)

    // method that gives me access to the protected attribute
    monkey.callProtectedAttribute()

    val bird = BirdScopeLessonOne("name", 235.6, true, true)
    bird.soundPublic()
    bird.soundInternal()
    println(bird.isBird)
    println(bird.isVegetarian)
}