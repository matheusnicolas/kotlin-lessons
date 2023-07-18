package oo.inheritance

open class Animal(val name: String)

class Dog : Animal {

    private val size: Double

    constructor(name: String, size: Double) : super(name) {
        this.size = size
    }

    constructor(name: String) : this(name, 0.0)

    override fun toString(): String = "$name has $size cm of size"
}

fun main() {
    val dog = Dog("Rock", 85.6)
    val dog2 = Dog("Brigite")
    println(dog)
    println(dog2)
}