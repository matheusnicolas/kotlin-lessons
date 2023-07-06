package functions

class Operations {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sub(a: Int, b: Int): Int {
        return a - b
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun calculate(a: Int, b: Int, function: (Int, Int) -> Int) : Int {
    return function(a, b)
}

fun main(args: Array<String>) {
    println("Sum result: ${calculate(10, 10, Operations()::sum)}")
    println("Sum from top level function: ${calculate(5, 5, ::sum)}")
    println("Sub result: ${calculate(90, 90, Operations()::sub)}")
}