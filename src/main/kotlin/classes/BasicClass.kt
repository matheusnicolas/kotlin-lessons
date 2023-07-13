package classes

class Customer(var name: String) // não constante
class Customer2(val name: String) // variável
class Customer3(initialName: String) { // para apenas para uso interno da classe
    val name: String = initialName
}

fun main(args: Array<String>) {
    val c1 = Customer(name = "Matheus")
    c1.name = "Nicolas"
    println("${c1.name} is a modifiable name!")

    val c2 = Customer2("Silva")
    println("The class with name ${c2.name} cannot me modified!")

    val c3 = Customer3(initialName = "Joao")
    println("The name for this one is ${c3.name}!")
}