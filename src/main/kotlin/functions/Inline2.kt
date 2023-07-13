package functions

inline fun <T> executeWithLog(functionName: String, function: () -> T): T {
    println("Entering the method $functionName...")

    try {
        return function()
    } finally {
        println("Method $functionName finalizing...")
    }
}

fun sum2(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    val result = executeWithLog("sum") {
        sum2(4, 5)
    }

    println(result)
}