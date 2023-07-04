package fundamentals.conditionals

fun main(args: Array<String>) {
    val value = 2;

    when(value) {
        10, 9 -> println("Fantastic!")
        8, 7 -> println("Congratulations!")
        6, 5, 4 -> println("You can recover!")
        in 0..3 -> println("Game over!")
        else -> print("Invalid!")
    }
}