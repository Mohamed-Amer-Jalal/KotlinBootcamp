package classes

object MobyDickWhale {
    val author = "Herman Melville"
    fun jump() {}
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    Green(0x00FF00),
    BLUE(0x0000FF)
}

sealed class Seal

data object SeaLion : Seal()

data object Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when(seal){
        is Walrus -> "Walrus"
        is SeaLion -> "SeaLion"
        else -> "Nothing"
    }
}