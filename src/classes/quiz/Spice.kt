package classes.quiz

import java.util.*

class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() {
            return when (spiciness.lowercase(Locale.getDefault())) {
                "mild" -> 5
                "medium" -> 10
                "hot" -> 15
                else -> 0 // Default to 0 if spiciness is not recognized
            }
        }

    init { println("Spice created - Name: $name, Spiciness: $spiciness, Heat: $heat") }
}

// Helper function to create salt
fun makeSalt(): Spice {
    return Spice(name = "salt", spiciness = "not spicy")
}

fun main() {
    // Create a spice
    val curry = Spice(name = "curry", spiciness = "medium")

    // Create a list of spices
    val spiceList = listOf(
        Spice(name = "cayenne", spiciness = "hot"),
        Spice(name = "pepper", spiciness = "medium"),
        Spice(name = "coriander", spiciness = "mild"),
        makeSalt(),
        curry
    )

    // Filter spices that are spicy or less than spicy
    val lessSpicySpices = spiceList.filter { it.heat <= 10 }

    // Print out less spicy spices
    println("Less spicy spices:")
    lessSpicySpices.forEach { spice ->
        println("Name: ${spice.name}, Spiciness: ${spice.spiciness}, Heat: ${spice.heat}")
    }
}