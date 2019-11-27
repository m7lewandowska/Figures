class Circle(val r: Double,  Kolor: String = ""): Fig(Kolor) {

    override fun pole(): Double {
        return  Math.PI*r*r
    }

    override fun obwod(): Double {
        return 2*Math.PI*r
    }

    /*override fun print()
    {
        println("${Kolor}Koło ${"\u001B[0m"} ")
        println("Pole koła: " + pole())
        println("Obwod koła: " + obwod())
        println()
    }*/
}