package functions

import java.util.Calendar

data class Time(val hour: Int, val minute: Int, val second: Int)

fun now(): Time {
    val now = Calendar.getInstance();

    with(now) {
        return Time(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

fun main(args: Array<String>) {
    val (h, m, s) = now()
    println("$h:$m:$s")
}