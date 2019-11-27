class Square(val a: Double,  Kolor: String = ""): Fig(Kolor), FigDrawable {

    fun printa()
    {
        println(a)
    }
    override fun pole(): Double {
        return  a*a
    }

    override fun obwod(): Double {
        return 4*a
    }

    override fun print()
    {
        println("${Kolor}Kwadrat ${"\u001B[0m"} ")
        println("Pole kwadratu: " + pole())
        println("Obwod kwadratu: " + obwod())
        println()
    }
}