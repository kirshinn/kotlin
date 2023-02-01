package base

fun main() {
    // первый способ lambda expression
    val sum = { x: Int, y: Int -> x + y}

    // второй способ lambda expression
    val sumv2: (Int, Int) -> Int = { x, y -> x + y}

    // ключевое слово it используется когда передается один параметр
    val dounbling: (Int) -> Int = { it * it }

    val student: (String) -> String = {
        val age = 20
        "Меня зовут $it, мне $age лет"
    }

    println(student("Иван"))

}