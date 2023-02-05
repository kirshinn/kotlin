package classes

data class Pupil(val name: String, val mark: Int, val exam: Int) {
    override fun toString(): String {
        return "Pupil name $name"
    }
}
