package fundamentals

fun main(args: Array<String>) {
    val a: Int? = null; //safe call operator
    println(a?.dec())
}