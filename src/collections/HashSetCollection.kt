package collections

fun main() {

    /**
     * Stores unique elements in an undefined order
     * It's mutable, so I can add, remove and edit elements
     */

    val numbers = hashSetOf(1,2,3,4,4,3,2,6,7,7,7,8)

    // [1, 2, 3, 4, 6, 7, 8]
    println(numbers)

    numbers.add(10)
    numbers.add(2)

    // [1, 2, 3, 4, 6, 7, 8, 10]
    println(numbers)

    numbers.remove(3)

    // [1, 2, 4, 6, 7, 8, 10]
    println(numbers)

    val index = numbers.indexOf(10)
    println("Index of element 10 is $index")

    val hashSetWithNull = hashSetOf(2,3,4,null, null, 2, 5)

    // [null, 2, 3, 4, 5] -> the order is not preserved
    println(hashSetWithNull)

    println("HashSet contains null in its collection: ${hashSetWithNull.contains(null)}")
}