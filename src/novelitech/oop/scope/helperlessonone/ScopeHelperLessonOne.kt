package com.novelitech.oop.scope.helperlessonone

import com.novelitech.oop.scope.lessonone.AnimalScopeLessonOne

/**
 * Modifiers:
 * private - visible inside the class only
 * protected - visible inside class and inheriting classes
 * internal - visible inside package
 * public - visible to anyone accessing the class
 *
 * Default is public
 */

class BirdScopeLessonOne(
    name: String, // private
    weight: Double, // protected
    isBird: Boolean, // internal
    isVegetarian: Boolean, // public
) : AnimalScopeLessonOne(
    name,
    weight,
    isBird,
    isVegetarian,
) {

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