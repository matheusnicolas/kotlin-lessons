package functions

class Product(val name: String, val price: Double)

infix fun Product.expensiveThan(product: Product): Boolean = this.price > product.price

fun main(args: Array<String>) {
    val product1 = Product("iPhone 14", 6000.0)
    val product2 = Product(price = 3000.0, name = "iPad")
    println(product1 expensiveThan product2)
    println(product2 expensiveThan product1)
}