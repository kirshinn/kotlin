package base

import java.util.Scanner

fun main() {
    print("Введите возраст: ")
    val reader = Scanner(System.`in`)
    val age = reader.nextInt()

    when(age) {
        in 7..18 -> println("школьник")
        in 19..22 -> println("бакалавр")
        in 23..24 -> println("магистр")
        in 25..28 -> println("астпирант")
        !in 7..28 -> println("вне диапазона")
        else -> println("неопределенное значение")
    }
}