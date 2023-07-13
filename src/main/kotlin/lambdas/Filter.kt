package lambdas

data class Student(val name: String, val score: Double)

fun main(args: Array<String>) {
    val students = arrayListOf(
        Student("Pedro", 8.0),
        Student("Rafael", 7.0),
        Student("Joao", 6.0),
        Student("Souza", 3.0),
        Student("Maria", 10.0)
    )

    val approveds = students.filter { it.score >= 7.0 }.sortedBy { it.name }
    println(approveds)
}