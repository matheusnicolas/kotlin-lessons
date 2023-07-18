package collections

fun main() {
    val numbers = Array<Int>(10) { i -> i * 10 }
    val numbersL = listOf<Int>(1, 2, 3)
    for (number in numbers) {
        println(number)
    }
    val numbersM = mutableListOf<String>("Manoel", "Souza")
    numbersM.add("João")

    for (name in numbersM) {
        println(name)
    }
}