package basictypes

fun main() {

    val myCar = "My car won't start"
    val begin = myCar.indexOf("car")
    println(myCar.substring(begin, begin + 3))
}