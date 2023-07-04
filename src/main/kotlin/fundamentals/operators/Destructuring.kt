package fundamentals.operators

data class Car(val brand: String, val model: String)

fun main(args: Array<String>) {
    val (brand, model) = Car("Gol", "Bola");
    println("Car: $brand $model");

    val (man, woman) = listOf("John", "Mary");
    println("$man and $woman")

    val (_, _, thirdPlace) = listOf("John", "Mary", "Fabio");
    println("The third goes to $thirdPlace")
}