package lambdas

class Calculator2 {
    var result = 0

    fun sum(value: Int, value2: Int) {
        result += value + value2
    }

    fun add(value: Int) {
        result += value
    }
}

fun main() {
    val calculator = Calculator2()
    calculator.apply { sum(4, 5) }.apply { add(5) }.apply { println(result) }

    calculator.apply {
        sum(4, 5)
        add(5)
        println(result)
    }

    with(calculator) {
        sum(4 , 5)
        add(5)
        println(result)
    }
}