package classes.quiz

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor: SpiceColor {
    override val color: Color = Color.YELLOW
}

open class Spices(val name: String, val spiciness: String = "mild") : SpiceColor {
    open fun prepareSpice() {}

    override val color: Color = YellowSpiceColor.color
}

class Curry(name: String, spiciness: String): Spices(name, spiciness), Grinder {
    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind() {
        println("Grinding the spice")
    }
}

fun main() {
    val curry = Curry(name = "Madras Curry", spiciness = "hot")
    println("Spice: ${curry.name}, Spiciness: ${curry.spiciness}, Color: ${curry.color}")
    curry.prepareSpice()
}