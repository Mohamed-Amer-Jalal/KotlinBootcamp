package classes.quiz

import java.util.*

class SimpleSpice(val name: String, val spiciness: String) {
    val heat: Int
        get() = when (spiciness.lowercase(Locale.getDefault())) {
                "mild" -> 5
                "medium" -> 10
                "hot" -> 15
                else -> 0 // Default to 0 if spiciness is not recognized
        }
}

fun main() {
    // Create an instance of SimpleSpice
    val currySpice = SimpleSpice(name = "curry", spiciness = "mild")

    // Print out its name and heat
    println("Spice: ${currySpice.name}")
    println("Heat: ${currySpice.heat}")
}