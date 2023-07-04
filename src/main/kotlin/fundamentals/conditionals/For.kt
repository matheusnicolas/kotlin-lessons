package fundamentals.conditionals

fun main(args: Array<String>) {
    for (i in 1..10) {
        println(i);
    }

    for (i in 10 downTo 1) {
        println("Index: $i");
    }

    for (i in 0..100 step 5) {
        println("Index with step: $i");
    }

    for (i in 100 downTo 0 step 5) {
        println("Index with step downTo: $i");
    }

    val students = arrayListOf("João", "Maria", "Fabiana");

    for ((index, student) in students.withIndex()) {
        println("${index + 1}: $student")
    }
}