package functions

inline fun transaction(function: () -> Unit) {
    println("opening transaction...")

    try {
        function()
    } finally {
        println("closing transaction...")
    }
}

fun main(args: Array<String>) {
    transaction {
        println("Executing SQL 1...")
    }
}