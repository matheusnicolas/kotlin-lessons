package fundamentals.conditionals

fun main(args: Array<String>) {
    val a: Int = 5;
    val b: Int = 8;

    val greater: Int = if (a > b) {
        println("A is greater!");
        a;
    } else {
        println("B is greater!");
        b;
    }

    var example2: Int = if (a > b) a else b;

    println("Show Greater: ${greater}!")
    println("Example 2: ${example2}!")
    val test: Double = 8.0

    if (test in 9.0..10.0) {
        println("here 1")
    } else if (test in 7.0..8.0) {
        println("here 2")
    }

}