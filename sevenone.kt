import kotlin.math.sqrt

fun main() {
    try {
        println("Введите a")
        var a = readln()!!.toByte()
        println("Введите b")
        var b = readln()!!.toByte()
        println("Введите x")
        var c = readln()!!.toByte()
        var p: Int = (a+b+c)/2
        println("s=" + p*(p-a)*(p-b)*(p-c))
    }
    catch (e: NumberFormatException) { println("Введено недопустимое значение") }
}