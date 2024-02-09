fun main()
{
    try
    {
        print("Введите радиус окружности: ")
        var r = readLine()!!.toDouble()
        var pi = 3.14
        var l = 0.0
        var P = 0.0
        when
        {
            r > 0 ->
            {
                l = 2 * pi * r
                P = 2 * r * 4
                println("Длина окружности = ${String.format("%.2f", l)}\nПериметр описанного квадрата = ${String.format("%.2f", P)}")
            }
            else -> println("Радиус окружности не может быть меньше или равен нулю")
        }
    }
    catch(e:Exception)
    {
        println("Неверный формат данных")
    }
}