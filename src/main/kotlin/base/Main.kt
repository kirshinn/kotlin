package base

import classes.Student

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

}

fun mult (a: Int, b: Int) = a*b