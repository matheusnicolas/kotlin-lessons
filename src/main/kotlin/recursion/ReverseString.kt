package recursion

fun main() {
    println(reverseString("it should reverse this string with recursion!"))
}


fun reverseString(input: String): String {
    if (input == "") {
        return ""
    }

    return reverseString(input.substring(1)) + input.first()
}