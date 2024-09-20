package functionalManipulation

import java.util.*

data class Fish(var name: String)

fun main() {
    fishExamples()
}

fun String.capitalizeLetter() = replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

fun fishExamples() {
    val fish = Fish("splashy")
    println( with(fish.name) { capitalizeLetter() } )

    myWith(fish.name) { println(capitalizeLetter()) }

    myWith(fish.name, object: (String) -> Unit { override fun invoke(name: String) { name.capitalizeLetter() } })

    println(fish.run { name.capitalizeLetter() })

    println(fish.apply { name = "Shark" })

    println(fish.name.capitalizeLetter().let { it + "Fish" }.length.let { it + 31 })

    // with inline no object is created, and lambda body is inlined here
    fish.name.capitalizeLetter()
}

inline fun myWith(name: String, block: String.() -> Unit) { name.block() }