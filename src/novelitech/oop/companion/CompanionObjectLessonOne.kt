package com.novelitech.oop.companion
//
///**
// * It's a way to make code available from a class without the need of an object/instantiation from that class. It's
// * called static code.
// * it's basically the static keyword in Dart to attributes and methods inside a class where I know these as attributes
// * and methods from Class. When I need to have an object from a class to access them I call them attributes and methods
// * from object
// */
//
//open class CarCompanionObjectOne(val name: String, val price: Double) {
//
//    companion object {
//
//        val type: String = "Sport"
//        var brand: String? = null
//
//        fun printListOfCars() {
//            println("Car one")
//            println("Car two")
//            println("Car three")
//            println("Car four")
//            println("Car five")
//        }
//    }
//}
//
//class CarChildCompanionObjectOne(name: String, price: Double) : CarCompanionObjectOne(
//    name,
//    price
//) {
//
//    val isChild = true
//
//    companion object {
//
//        fun sayHello() {
//            println("Hello")
//        }
//    }
//}
//
//fun main() {
//
//    // I CAN NOT access attributes and methods from instantiation because I do not have an object from this class
//    println(CarCompanionObjectOne.type)
//    println(CarCompanionObjectOne.brand)
//    CarCompanionObjectOne.brand = "New brand"
//    println(CarCompanionObjectOne.brand)
//    CarCompanionObjectOne.printListOfCars()
//
//    println()
//
//    // When I have an object from this class I CAN NOT access the attributes and methods from companion object (static)
//    // The only way to access them is using the name of the class. when the attribute/method
//    val car = CarCompanionObjectOne("Fusca", 123.54)
//
//    println(car.name)
//    println(car.price)
//
//    println()
//
//    // Companion objects are not inherited, so if I try to access some static attributes/methods I will get an error
//    // Companion objects are exclusive to each class
////    CarChildCompanionObjectOne.printListOfCars()
//}