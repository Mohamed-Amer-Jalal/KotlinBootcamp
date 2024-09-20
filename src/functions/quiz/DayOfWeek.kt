package functions.quiz

import java.util.Calendar

fun main() {
    println("Hello, World!")
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")

    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    val dayString = when (dayOfWeek) {
        Calendar.SUNDAY -> "Sunday"
        Calendar.MONDAY -> "Monday"
        Calendar.TUESDAY -> "Tuesday"
        Calendar.WEDNESDAY -> "Wednesday"
        Calendar.THURSDAY -> "Thursday"
        Calendar.FRIDAY -> "Friday"
        Calendar.SATURDAY -> "Saturday"
        else -> "Unknown"
    }

    println("It is $dayString.")
}