package fundamentals

fun main(args: Array<String>) {
    val values = arrayOf("", 9,  6, 0)
    for (value in values) {
        castTest(value)
    }
}


fun castTest(x: Any) {
    when(x as? Int ?: 1) {
        9, 10 -> println("A")
        7, 8 -> println("B")
        5, 6 -> println("C")
        1, 2 -> println("É o Elvis")
        else -> println("Invalid")
    }
}