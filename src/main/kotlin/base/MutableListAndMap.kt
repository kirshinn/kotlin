package base

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Введите первое числа : ")
    val a = reader.nextInt()
    print("Введите второе число : ")
    val b = reader.nextInt()

    val checkArray = mutableListOf<Int>()

    if (a > b) {
        for (i in b..a) {
            checkArray.add(i)
        }
    } else {
        for (i in a..b) {
            checkArray.add(i)
        }
    }
}