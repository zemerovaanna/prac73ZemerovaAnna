fun main()
{
    try {
        println("Координаты")
        var x1: Byte = readln()!!.toByte()
        var x2: Byte = readln()!!.toByte()
        var x3: Byte = readln()!!.toByte()
        var x4: Byte = readln()!!.toByte()
        var y1: Byte = readln()!!.toByte()
        var y2: Byte = readln()!!.toByte()
        var y3: Byte = readln()!!.toByte()
        var y4: Byte = readln()!!.toByte()
        var s: Int = "0".toInt()
        var zero: Byte = 0
        if (x1==x4 && x2==x3 && y1==y2 && y3==y4)
        {
            if (x1==zero && x2>zero && x3>zero && x4==zero && y1>zero && y2>zero && y3>zero && y4>0)
            {
                s=(x2-x1)*(y2-y3)
            }
            if (x1>zero && x2>zero && x3>zero && x4>zero && y1>zero && y2>zero && y3==zero && y4==zero)
            {
                s=(x2-x1)*(y2-y3)
            }
            if (x1>zero && x2>zero && x3>zero && x4>zero && y1>zero && y2>zero && y3>zero && y4>zero)
            {
                s=(x2-x1)*(y2-y3)
            }
            if (x1==zero && x2>zero && x3>zero && x4==zero && y1>zero && y2>zero && y3==zero && y4==zero)
            {
                s=(x2-x1)*(y2-y3)
            }
            if (x1<zero && x2>zero && x3>zero && x4<zero && y1>zero && y2>zero && y3>zero && y4>zero)
            {
                s=x2*(y2-y3)
            }
            if (x1>zero && x2>zero && x3>zero && x4>zero && y1>zero && y2>zero && y3<zero && y4<zero)
            {
                s=(x2-x1)*y1
            }
            println("Площадь:"+ s)
        }
        else println("Ошибка!")
    }
    catch (e: NumberFormatException) { println("Введено недопустимое значение") }
}