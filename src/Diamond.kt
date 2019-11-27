class Diamond(val a: Double, val h: Double,  Kolor: String = ""): Fig(Kolor) {

    override fun pole(): Double {
        return  a*h
    }

    override fun obwod(): Double {
        return 4*a
    }

    /*override fun print()
    {
        println("${Kolor}Romb ${"\u001B[0m"} ")
        println("Pole rombu: " + pole())
        println("Obwod rombu: " + obwod())
        println()
    }*/
}