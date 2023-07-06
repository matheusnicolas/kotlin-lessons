package fundamentals

fun main(args: Array<String>) {
    val testString: String = "Let's go!";
    smart(testString);
    val testFloat: Float = 3.0f;
    smartV2(testFloat);
    val testInt = 1;
    smart(testInt);
    smartV2(testInt);
    smartV3(testInt);
    smartV3(testString);
    smartV3(testFloat);
}

fun smart(x: Any) {
    if (x is String) {
        println(x.uppercase());
    } else if (x is Int) {
        println(x.plus(1))
    }
}

fun smartV2(x: Any) = if (x is String) println(x.uppercase()) else if (x is Int) println(x.plus(10)) else println("None");

fun smartV3(x: Any) {
    when(x) {
        is String -> println(x.uppercase())
        is Int -> println(x.plus(10))
        else -> println("Don't trick me!")
    }
}


