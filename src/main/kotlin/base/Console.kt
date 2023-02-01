package base

import java.util.Scanner

fun main() {
    print("Введите возраст: ")
    val reader = Scanner(System.`in`)
    var age = reader.nextInt()

    if (age > 18)
        println("вам можно пройти в клуб")
    else if (age == 18)
        println("вам 18 лет")
    else
        println("вам нельзя пройти в клуб")
}