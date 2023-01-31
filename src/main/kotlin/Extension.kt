fun main() {
    println("Kotlin is programming language".countWords("l"))
    println(1 big 3)
    println(3 big 2)
}

fun String.countWords(s: String) = (length - replace(s, "").length)

infix fun Int.sum(i: Int) = this + i

infix fun Int.big(value: Int) = this > value