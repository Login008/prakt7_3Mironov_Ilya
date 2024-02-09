fun main() {
    try {
    print("Введите значение внутреннего радиуса: ")
    val r1 = readLine()!!.toDouble()
    print("Введите значение внешнего радиуса: ")
    val r2 = readLine()!!.toDouble()
    val pi = 3.14
    var area = 0.0
    when {
        (r1 > 0) and (r2 > 0) -> when {
            (r1 < r2) -> {area = pi * (r2 * r2 - r1 * r1)
            println("Площадь кольца равна: ${String.format("%.2f", area)}")}
            else -> println("Внешний радиус не может быть меньше или равен внутреннему радиусу")
        }
        else -> println("Радиус окружности не может быть меньше или равен нулю")
    } }
    catch (e:Exception)
    {
        println("Неверный формат данных")
    }
}