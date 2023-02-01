package base

fun main() {
    val result = sum(10, 20, 30)
    println(result)
}

fun sum(vararg elements: Int): Int {
    var result = 0;
    for (el in elements) {
        result += el
    }
    return result
}