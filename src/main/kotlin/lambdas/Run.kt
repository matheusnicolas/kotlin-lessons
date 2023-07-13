package lambdas

data class House(var address: String = "", var num: Int = 0)

fun main() {
    val house = House()

    house.run {
        address = "Elm Street"
        num = 400
    }
    println(house)
}