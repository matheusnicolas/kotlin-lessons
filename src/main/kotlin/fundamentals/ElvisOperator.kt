package fundamentals

fun main(args: Array<String>) {
    val optional: String? = null;
    val obligated: String = optional ?: "Default Value";

    println(obligated)
}