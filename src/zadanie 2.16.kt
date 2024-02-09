fun main() {
    try {
    print("Введите значение a: ")
    var a = readLine()!!.toDouble()
    print("Введите значение b: ")
    var b = readLine()!!.toDouble()
    print("Введите значение c: ")
    var c = readLine()!!.toDouble()
    print("Введите значение u: ")
    var u = readLine()!!.toDouble()
    print("Введите значение v: ")
    var v = readLine()!!.toDouble()
    if (u < v)
    {
        var min = 0.0
        var max = 0.0
        var y1 = a * u * u + b * u + c
        var y2 = a * v * v + b * v + c
        if (y1 < y2)
            min = y1
        else
            min = y2
        if (y1 > y2)
            max = y1
        else
            max = y2
        println("Минимальное значение: ${String.format("%.2f", min)}")
        println("Максимальное значение: ${String.format("%.2f", max)}")
    }
    else
    {
        println("Значение u не может быть больше или равно значению v")
    } }
    catch (e:Exception)
    {
        println("Неверный формат данных")
    }
}