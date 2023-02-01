package classes

// первичный конструтор
class Animal (_name: String, _age: Double) {

    private val name: String
    private val age: Double
    private var weight: Double = 0.0

    init {
        name = _name
        age = _age

    }

    // вторичный конструктор
    constructor(_name: String, _age: Double, _weight: Double): this(_name, _age) {
        weight = _weight
    }
}