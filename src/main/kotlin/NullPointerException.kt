private var name: String? = null
fun main() {
    println(name!!.length) // переменная может быть null, но мы уверены что в ней лежит какое то значение
    println(name?.length) // оператор безопасного вызова, проверка на null и вызов метода
    println(name?.length?:10) // оператор элвис с заданием значения по умолчанию для нулабельного типа

}