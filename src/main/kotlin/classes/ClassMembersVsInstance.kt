package classes

class OrderItem(val name: String, var price: Double) {
    companion object {
        fun create(name: String, price: Double) = OrderItem(name, price)
        @JvmStatic var discount: Double = 0.0
    }

    fun priceWithDiscount(): Double {
        return price - (price * discount)
    }
}

fun main(args: Array<String>) {
    val item1 = OrderItem.create("TV 50 Inches", 3000.0)
    val item2 = OrderItem("Microwave", 500.0)
    OrderItem.discount = 0.10
    println(item1.priceWithDiscount())
    println(item2.priceWithDiscount())
}