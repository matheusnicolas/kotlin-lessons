package advanced

fun factorial(value: Int): Int {
    if (value <= 1) {
        return 1
    }
    return value * factorial(value - 1)
}

fun main() {
    println("A soma fatorial é ${factorial(5)}")
}