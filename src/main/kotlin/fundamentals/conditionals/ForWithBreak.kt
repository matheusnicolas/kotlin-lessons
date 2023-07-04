package fundamentals.conditionals

fun main(args: Array<String>) {
    external@for (i in 0..9) {
        println("i index: $i")
        for (j in 1..9) {
            println("J index: $j")
            if (i == 3) {
                println(i)
                break@external
            }
        }
    }
    println("The end!")
}