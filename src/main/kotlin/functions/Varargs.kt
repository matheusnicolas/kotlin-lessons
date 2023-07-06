package functions

fun order(vararg numbers: Int): IntArray {
    return numbers.sortedArray();
}

fun main(args: Array<String>) {
    for (n in order(9, 18, 0, -39, 9, 5, 4, 3, 9, 39)) {
        print("$n ")
    }
}