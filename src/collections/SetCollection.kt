package collections

fun main() {

    /**
     * Stores unique elements in an undefined order
     * It's immutable, so I can not add, edit or remove any element
     */

    // It will create a Set from type Int and will have unique elements, so duplication
    // will be ignored, and it will be registered just once
    val numbers = setOf(4,5,6,7,2,3,4,5)

    // [4, 5, 6, 7, 2, 3]
    println(numbers)

    // To create an empty Set I need to specify its type
    val emptySet = setOf<Int>()

    // The null value follows the same behavior from non-nullable values from not accepting duplication
    val setWithNull: Set<Int?> = setOf(3,4,null,6,3,2,null)

    // [3, 4, null, 6, 2]
    println(setWithNull)
}