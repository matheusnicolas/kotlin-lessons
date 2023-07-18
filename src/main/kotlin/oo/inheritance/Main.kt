package oo.inheritance

fun main() {
    val car = Ferrari()
    car.accelerate()
    println(car)

    car.turnOnTurbo()
    car.accelerate()
    println(car)

    car.breakDown()
    car.breakDown()
    println(car)
}