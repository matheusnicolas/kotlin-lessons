package advanced

annotation class Positive
annotation class NotEmpty

class Person(id: Int, name: String) {
    @Positive
    var id: Int = id

    @NotEmpty
    var name: String = name
}

// Reflection...
fun getValue(obj: Any, attributeName: String): Any {
    val attribute = obj.javaClass.getDeclaredField(attributeName)
    val isAccessible = attribute.isAccessible

    attribute.isAccessible = true
    val value = attribute.get(obj)
    attribute.isAccessible = isAccessible
    return value
}

fun validate(obj: Any): List<String> {
    val messages = ArrayList<String>()
    obj::class.members.forEach { member ->
        member.annotations.forEach { annotation ->
            val value = getValue(obj, member.name)
            when(annotation) {
                is Positive ->
                    if (value !is Int || value <= 0) {
                        messages.add("The value '$value' is not a positive number!")
                    }
                is NotEmpty ->
                    if (value !is String || value.trim().isEmpty()) {
                        messages.add("The value '$value' is not a valid String!")
                    }
            }
        }
    }
    return messages
}

fun main() {
    val obj1 = Person(1, "John")
    val obj2 = Person(-2, "")
    println(validate(obj1))
    println(validate(obj2))
}