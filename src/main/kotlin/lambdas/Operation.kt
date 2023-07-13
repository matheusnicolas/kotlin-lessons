package lambdas

interface Operation {
    fun execute(a: Int, b: Int): Int
}

class Multiply: Operation {
    override fun execute(a: Int, b: Int): Int {
        return a * b
    }
}

class Calculator() {
    fun calculate(a: Int, b: Int): Int {
            return a * b
    }

    fun calculate(a: Int, b: Int, operation: Operation): Int {
        return operation.execute(a, b)
    }

    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
}

fun main(args: Array<String>) {
    val calculator = Calculator()
    val result = calculator.calculate(4, 5)
    val result2 = calculator.calculate(3, 4 , Multiply())

    val subtract = { a: Int, b: Int -> a - b}

    val result3 = calculator.calculate(3, 4, subtract)

    println("$result $result2 $result3")
}