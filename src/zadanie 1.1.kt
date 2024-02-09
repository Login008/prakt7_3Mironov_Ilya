fun main()
{
    try
    {
        print("Введите сопротивление R1: ")
        var R1 = readLine()!!.toDouble()
        print("Введите сопротивление R2: ")
        var R2 = readLine()!!.toDouble()
        print("Введите сопротивление R3: ")
        var R3 = readLine()!!.toDouble()
        if ((R1 > 0) and (R2 > 0) and (R3 > 0))
        {
            var OR = 1 / (1/R1 + 1/R2 + 1/R3)
            println("Общее сопротивление при параллельном соединении = ${String.format("%.2f", OR)}")
        }
        else
        {
            println("Сопротивление не может быть меньше или равно нулю")
        }
    }
    catch (e:Exception)
    {
        println("Неверный формат данных")
    }
}