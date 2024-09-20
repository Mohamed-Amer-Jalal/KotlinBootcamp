package functions.quiz

fun main() {
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad", "rainy"))
    println(whatShouldIDoToday("angry", "sunny", 30))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "sunny" -> "Go for a walk."
        mood == "sad" && weather == "rainy" -> "Stay home and watch a movie."
        mood == "angry" && temperature > 25 -> "Go for a swim."
        else -> "Stay home and read."
    }
}