package classes

class CustomerNew {

    constructor(name: String) {
        this.name = name
    }

    var name: String
        get() = "My name is $field"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anonymous"
        }
}

fun main(args: Array<String>) {
    val customer = CustomerNew("")
    println(customer.name)

    val customer2 = CustomerNew("João")
    println(customer2.name)
}