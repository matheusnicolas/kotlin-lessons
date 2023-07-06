package functions

fun workRelation(boss: String, staff: String): String {
    return "$staff works for $boss";
}

fun main(args: Array<String>) {
    println(workRelation("Joao", "Maria"));
    println(workRelation(staff = "Mario", boss = "Luigi"))
}