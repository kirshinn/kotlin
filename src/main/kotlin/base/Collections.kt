package base

fun main() {
    val itemsArray = mutableListOf<Int>()
    val listAdd = listOf(1, 2, 3, 4, 5, 6, 7)
    itemsArray.addAll(listAdd)
    itemsArray[0] = 15
    itemsArray.removeAt(2)
    itemsArray.add(-2)

    itemsArray.forEach { i ->
        println(i)
    }
}