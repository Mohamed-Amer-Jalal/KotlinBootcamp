package functionalManipulation.quiz

class Games(private val width: Int = 4, private val height: Int = 4) {
    private var playerLocation = Location(0, 0)

    private val map = Array(width) { arrayOfNulls<String>(height) }

    init {
        initializeMap()
        updateLocation()
    }

    private fun initializeMap() {
        for (i in 0..<width)
            for (j in 0..<height)
                map[i][j] = "Location at ($i, $j)"
    }

    private fun updateLocation() {
        val x = playerLocation.x.coerceIn(0, width - 1)
        val y = playerLocation.y.coerceIn(0, height - 1)
        println("Current Location: ${map[x][y]}")
    }

    private fun move(where: () -> Unit) {
        where()
        updateLocation()
    }

    fun makeMove(direction: String?) {
        when (direction) {
            "n" -> move { playerLocation = playerLocation.copy(y = playerLocation.y - 1) }
            "s" -> move { playerLocation = playerLocation.copy(y = playerLocation.y + 1) }
            "e" -> move { playerLocation = playerLocation.copy(x = playerLocation.x + 1) }
            "w" -> move { playerLocation = playerLocation.copy(x = playerLocation.x - 1) }
            else -> move { println("Invalid direction!") }
        }
    }
}

data class Location(val x: Int, val y: Int)

fun main() {
    val game = Games()

    while (true) {
        println("Enter a direction: n/s/e/w:")
        val input = readlnOrNull()
        game.makeMove(input)
    }
}