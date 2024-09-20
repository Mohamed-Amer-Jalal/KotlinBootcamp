package functions

import java.util.*

fun main() {
    feedTheFish()
    swim(time = 50, speed = "slow")

    var bubbles = 0
    while (bubbles < 50) { bubbles++ }

    repeat(2) {
        println("A fish is swimming")
    }
}

fun getDirtySensorReading() = 20

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()) :Boolean {
    val isTooHot = temperature > 30
    val isDirty = dirty >30
    val isSunday = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun makeNewAquarium() = println("Building a new aquarium")

fun aquariumStatusReport(aquarium: Any = makeNewAquarium()) {}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater2(temperature: Int = 22, dirty: Int = 20, day: String) :Boolean { return true }

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWater2(day = "Monday")
    if (shouldChangeWater(day)) {
        println("Change th water today")
    }
}

fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    return when(day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redWorms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

