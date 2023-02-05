package base

import classes.Genre
import classes.Human
import classes.Music
import classes.Student
import interfaces.GooglePhone

fun main(args: Array<String>) {
    println("Hello Kotlin!")
    println(mult(4,3))
    val a: Boolean = true
    val b: Char = 'y'
    val c: Int = 10
    val d: String = "This is string"
    var typeAny: Any = "Any type"

    val name = "Kotlin"
    var message: String = "language $name"

    val student = Student("Ivan", "Ivanov", 86.2)

    val music = Music().Band().classicMusic(10)

    val david = Human("David Bowie", 70, false)

    // деструктуризация
    val(sname, age, isAlive) = david

    println(sname)
    println(age)
    println(isAlive)

    // разделение с помощью деструктораи метода компонент
    val ssname = david.component1()
    val sage = david.component2()
    val sIsAlive = david.component3()

    val genre = Genre.ROCK
    // текущее значение перечисления
    println(genre.band)
    // текущее значение перечисления
    println(genre.name)
    // порядковый номер
    println(genre.ordinal)

    for (printValue in Genre.values())
        println(printValue)

    println(Genre.valueOf("CLASSIC"))
}

fun mult (a: Int, b: Int) = a*b