package classes

class Student(name: String, surname: String, mark: Double) {
    var name: String? = null
        get() {
            return if (field === null) {
                " "
            } else {
                field
            }
        }
    var surname: String? = null
        get() {
            return if (field === null) {
                " "
            } else {
                field
            }
        }
    var mark: Double = 0.0
        set(value) {
            if (value in 0.1.. 100.0) {
                field = value
            }
        }

}