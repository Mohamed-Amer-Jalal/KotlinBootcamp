package classes.quiz

data class SpiceContainer(val spice: Spices) {
    val label: String = spice.name
}

fun main() {
    val curryContainer = SpiceContainer(Curry(name = "Madras Curry", spiciness = "hot"))
    val saltContainer = SpiceContainer(Spices(name = "Salt"))

    println("Label for Curry Container: ${curryContainer.label}")
    println("Label for Salt Container: ${saltContainer.label}")
}