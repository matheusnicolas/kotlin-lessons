package lambdas

fun main(args: Array<String>) {
    val students = arrayListOf(
        "Pedro",
        "Rafael",
        "Souza"
    )
    students.map { it.uppercase() }.apply { println(this) }
}