package lambdas

class Product(val name: String, val price: Double)

val devices = listOf(
    Product("iPhone 11", 1100.0),
    Product("Galaxy S23", 1000.0),
    Product("iPod Touch Gen 8", 800.0)
)

fun main(args: Array<String>) {
    val totalize = { total: Double, current: Double -> total + current }
    val totalPrice = devices.map { it.price }.reduce(totalize)

    println("O preço médio é R$ ${totalPrice / devices.size}.")
}