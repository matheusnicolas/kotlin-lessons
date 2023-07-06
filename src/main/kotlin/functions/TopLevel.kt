package functions

fun min(a: Int, b: Int): Int {
    return if (a < b) a else b;
}

fun main(args: Array<String>) {
    println("O menor valor é ${min(10, 9)}");
}