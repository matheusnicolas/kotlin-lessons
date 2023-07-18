package advanced

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point = Point(x + other.x, y + other.y)
    operator fun unaryMinus(): Point = Point(-x, -y)
}

fun main() {
    val point1 = Point(10, 20)
    val point2 = Point(10, 20)

    println(-point1)
    println(point1 + point2)
}