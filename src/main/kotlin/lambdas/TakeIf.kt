package lambdas

fun main(args: Array<String>) {
    println("Type your message: ")
    val input = readLine()

    val message = input.takeIf { it?.trim() != "" } ?: "No message"
    println(message)
}