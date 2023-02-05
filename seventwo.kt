fun main(){
    try{
            var a: Int
            var b: Int
            var c: Int
            println("Введите число: ");
            var num: Short = readln()!!.toShort()


            a = (num / 100)
            b = (num / 10) % 10
            c = num % 10

            if (c - b == b - a)
            {
                println("True")
            }
            else
            {
                println("False")
            }

    }
    catch (e: NumberFormatException) { println("Введено недопустимое значение") }
}