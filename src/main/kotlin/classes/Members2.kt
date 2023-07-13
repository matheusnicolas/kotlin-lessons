package classes

class Calculator {

    private var result: Int = 0

    fun sum(vararg values: Int): Calculator {
        values.forEach { result += it }
        return this
    }

    fun sub(vararg values: Int): Calculator {
        values.forEach { result -= it }
        return this
    }

    fun multiply(vararg values: Int): Calculator {
        values.forEach { result *= it }
        return this
    }

    fun divide(vararg values: Int): Calculator {
        values.forEach { result = it }
        return this
    }

    fun clear(): Calculator {
        result = 0
        return this
    }

    fun print(): Calculator {
        println(result)
        return this
    }

    fun obtainResult(): Int {
        return result
    }
}

fun main(args: Array<String>) {
    val calculator = Calculator()
    calculator.sum(5, 10, 5).multiply(2).print()
    calculator.clear().sum(10, 10).print()
    println(calculator.obtainResult())
}