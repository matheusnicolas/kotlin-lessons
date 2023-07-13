package lambdas

fun main() {
    val listOWithNulls = listOf("A", null, "B", "C", null)

    for (item in listOWithNulls) {
        item?.let { println(it) }
    }
}