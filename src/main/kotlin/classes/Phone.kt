package classes

// ключевое слово open - класс доступен для наследования
open class Phone (private val os: String, private val model: String, private val cost: Int) {
    fun printInfo(): String {
        return "OS: $os, Model: $model, Cost: $cost"
    }
}