package oo.polimorfism

open class Food(val weight: Double)

class Bean(weight: Double) : Food(weight)
class Rice(weight: Double) : Food(weight)
class Egg(weight: Double) : Food(weight)

class Person(var weight: Double) {
    fun eat(food: Food) {
        weight += food.weight
    }
}

fun main() {
    val bean = Bean(.3)
    val rice = Rice(.3)
    val egg = Egg(2.0)
    val john = Person(80.5)
    john.eat(rice)
    john.eat(bean)
    john.eat(egg)

    println(john.weight)
}