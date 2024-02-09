fun main()
{
    try
    {
        print("Введите y: ")
        var y = readLine()!!.toDouble()
        var f = 0.0
        if (y > 2)
        {
            f = y + 2
        }
        else if (y < 1)
        {
            f = y * y + 2 * y + 0.3
        }
        else
        {
            f = y * y * y + 2 * y * y + 0.3 * y + 1
        }
        println("F(y) = ${String.format("%.2f", f)}")
    }
    catch (e:Exception)
    {
        println("Неверный формат данных")
    }
}