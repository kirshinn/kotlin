fun main() {
    outFunction("outer Function")
}

fun outFunction(outFunArg: String) {
    val outInt = 15

    // локальная функция
    fun innerFunction(innerFunArg: String) {
        println(innerFunArg)
        println(outFunArg)
        println(outInt)
    }

    innerFunction("inner Function")
}