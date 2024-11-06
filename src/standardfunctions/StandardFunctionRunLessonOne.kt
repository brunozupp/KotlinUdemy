package standardfunctions

/**
 * Same as with but invokes as an extension function (so it remembers the 'let')
 * Useful when you need a lambda that returns a result
 * Can be used to limit the scope of variables
 *
 * Both Let and Run can return a value
 */
fun main() {

    val person = mapOf<String, Any>(
        "name" to "Bruno",
        "age" to 25,
        "skills" to listOf("communicative", "learn fast", "bilingual"),
        "isGraduated" to true
    )

    val validateConditionsRun = person.run {

        val name = get("name") as String
        val age = get("age") as Int
        val skills = get("skills") as List<String>
        val isGraduated = get("isGraduated") as Boolean

        name == "Bruno" && isGraduated && skills.isNotEmpty() && age > 18
    }

    println("The value of the conditions (run): $validateConditionsRun")

    val validateConditionsLet = person.let {

        val name = it["name"] as String
        val age = it["age"] as Int
        val skills = it["skills"] as List<String>
        val isGraduated = it["isGraduated"] as Boolean

        name == "Bruno" && isGraduated && skills.isNotEmpty() && age > 18
    }

    println("The value of the conditions (let): $validateConditionsLet")

    println()

    val mapToAdd = mutableMapOf<String,Any>()

    // Using the 'run' to be just a block of code where I can do operations in the object. So it has the same
    // behavior as the 'let' as can be seemed in the file of it.
    mapToAdd.run {
        put("name", "Bruno")
        put("age", 25)
    }

    println(mapToAdd)

    println()

    // I can use the keyword 'this' to return the object itself
    val mapFromAnotherMap = mapToAdd.run {
        put("new key", "new value")
        this
    }

    println("Returning the object itself using this in the end of the 'run': $mapFromAnotherMap")

    /**
     * Another use of this is to isolate the code. It can and can not return a value.
     */

    run {
        mapFromAnotherMap["cat"] = "alceu"
        println("Isolating the code with 'run': $mapFromAnotherMap")
    }

    // I can type the returning, just as I do with generics
    val dogName = run<String> {
        mapFromAnotherMap["dog"] = "sergio"
        mapFromAnotherMap["dog"] as String // returning this
    }

    println("The dog is named $dogName")
}