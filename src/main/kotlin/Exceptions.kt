import java.lang.IllegalArgumentException
import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val number = reader.nextInt()

    if (number !in 0..10) {
        throw IllegalArgumentException ("Value must be between 0 and 10")
    }
}