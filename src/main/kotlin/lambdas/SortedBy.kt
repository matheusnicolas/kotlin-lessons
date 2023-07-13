package lambdas

fun main(args: Array<String>) {
    val listOfNames = listOf("Matheus", "Libras", "Arthur", "Pizza");

    val asc = listOfNames.sortedBy { it }
    println(asc)
    val desc = listOfNames.sortedBy { it.reversed() }
    print(desc)
}