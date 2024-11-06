package collections

fun main() {

    val colors = arrayListOf("blue", "red", "yellow")

    colors.add("green")

    println(colors)

    val names = arrayListOf<String>()
    names.add("Bruno")
    names.add("Pedro")
    println(names)
    names.removeLast()
    println(names)

    names.add("Pedro")
    names.add("Guilherme")
    names.add("Rafael")
    names.add("Miguel")
    println(names)

    // The same I do names[1] = "Fernanda"
    names.set(1, "Fernanda")
    println(names)
}