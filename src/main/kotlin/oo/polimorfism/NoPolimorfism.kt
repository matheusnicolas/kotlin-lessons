package oo.polimorfism

class Bean2(val weight: Double)
class Rice2(val weight: Double)

class Person2(var weight: Double) {
    fun eat(bean: Bean2) {
        weight += bean.weight
    }

    fun eat(rice: Rice2) {
        weight += rice.weight
    }
}

fun main() {
    val bean = Bean2(.3)
    val rice = Rice2(.3)

    val john = Person2(80.5)
    john.eat(rice)
    john.eat(bean)

    println(john.weight)
}