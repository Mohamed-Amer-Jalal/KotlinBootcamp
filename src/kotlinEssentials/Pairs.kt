package kotlinEssentials

fun main() {
    val equipment = "fishnet" to "catching fish"
    println(equipment.first)
    println(equipment.second)

    val equipment2 = "fishnet" to "catching fish" to "of big size" to "and strong"
    println(equipment2.first)
    println(equipment2.first.first)

    val equip = ("fishnet" to "catching fish") to ("of big size" to "and strong")
    println(equip)

    val fishnet = "fishnet" to "catching fish"

    val (tool, use) = fishnet
    println("The $tool is a tool for $use.")

    val fishnetString = fishnet.toString()
    println(fishnetString)

    println(fishnet.toList())

    fun giveMeATool():Pair<String, String> { return ("fishnet" to "catching fish") }
    val (tool2, use2) = giveMeATool()
    println("The $tool2 is a tool for $use2.")
}

