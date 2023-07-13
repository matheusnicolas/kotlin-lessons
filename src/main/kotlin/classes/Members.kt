package classes

class Date(var day: Int, var month: Int, var year: Int) {
    fun format(): String {
        return "$day/$month/$year"
    }
}


fun main(args: Array<String>) {
    val birth = Date(11, 11, 2000)
    println(birth.format())

    birth.day = 15
    println(birth.format())
}