package classes

class Product(var name: String, var price: Double, var discount: Double, var active: Boolean) {
    val inactive: Boolean get() = !active
    val priceWithDiscount: Double get() = price * (1 - discount)
}


fun main(args: Array<String>) {
    val p1 = Product("iPad", 2300.0, 0.20, true)
    println(p1.priceWithDiscount)

    val p2 = Product("Tablet", 2000.0, 0.5, false)
    println("${p2.name}\n\t De: R$ ${p2.price} \n\t Por: R$ ${p2.priceWithDiscount}")
}