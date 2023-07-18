package advanced

class Box <T>(val obj: T) {
    private val objects = ArrayList<T>()

    init {
        add(obj)
    }

    fun add(newObject: T) {
        objects.add(newObject)
    }

    override fun toString(): String = objects.toString()
}

fun main() {
    val schoolMaterial = Box("Pencil")
    schoolMaterial.add("Eraser")
    schoolMaterial.add("Book")
    println(schoolMaterial)

    val numbers = Box(1)
    numbers.add(2)
    numbers.add(3)
    numbers.add(10)
    println(numbers)
}