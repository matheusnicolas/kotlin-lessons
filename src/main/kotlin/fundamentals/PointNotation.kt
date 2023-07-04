package fundamentals

fun main(args: Array<String>) {
    val a: Int = 33.dec();
    val x: Int = 33.inc();
    val b: String = a.toString();

    println("Int: $a")
    println("Int 2: $x")
    println("First char: ${b.first()}")
}