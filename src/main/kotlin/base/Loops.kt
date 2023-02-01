package base

fun main() {
    for (i in 10 downTo  1 step 2)
        println(i)

    for (i in 1 until  10)
        println(i)

    // until -- цикл с исключением значения
    // downTo -- цикл в обратном порядке
    // step -- цикл с шагом

    val arrayNum = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (num in arrayNum.indices) {
        println("$num: ${arrayNum[num]}")
    }
}