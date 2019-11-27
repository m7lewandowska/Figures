enum class Color(val ansi: String) {
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    BLUE("\u001B[34m"),
    CYAN("\u001B[36m"),
    PURPLE("\u001B[35m"),
    YELLOW("\u001B[33m")
}

fun main(args: Array<String>) {

    var sum:Double = 0.0
    val lista = listOf<Fig>(Square(4.0, Color.BLUE.ansi),Square(8.0, Color.RED.ansi),
        Rectangle(5.0,2.0,Color.YELLOW.ansi), Circle(5.0, Color.PURPLE.ansi),
        Diamond(20.0,10.0,Color.CYAN.ansi))

    for(i in lista) {
        (i as? FigDrawable)?.print()
        sum = lista.sumByDouble{ fig-> fig.pole() }
        //sum += i.pole()
    }
    print("Suma: " + sum)
}