fun main()
{
    try {
        println("Введите скорость лодки в стоячей воде(км/ч):")
        var v: Byte = readln()!!.toByte()
        println("Введите скорость течения (км/ч):")
        var u: Byte = readln()!!.toByte()
        println("Введите время движения лодки по озеру (ч): ")
        var tone: Byte = readln()!!.toByte()
        println("Введите время движения лодки по реке против течения (ч):")

        var ttwo: Byte = readln()!!.toByte()
        var s: Int =v*tone+(v-u)*ttwo

        println("Лодка прошла:"+ s)
    }
    catch (e: NumberFormatException) { println("Введено недопустимое значение") }
}