class Rectangle(val a: Double, val b: Double, Kolor: String = ""): Fig(Kolor), FigDrawable {

    override fun pole(): Double {
        return  a*b
    }

    override fun obwod(): Double {
        return 2*a + 2*b
    }

    override fun print()
    {
        println("${Kolor}Prostokąt ${"\u001B[0m"} ")
        println("Pole prostokata: " + pole())
        println("Obwod prostokata: " + obwod())
        println()
    }
}