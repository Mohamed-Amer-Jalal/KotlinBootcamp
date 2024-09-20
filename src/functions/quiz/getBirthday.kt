package functions.quiz

fun main() {
    var fortune: String
    for (i in 1..10) {
        val birthday = getBirthday()
        fortune = getFortune(birthday)
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getFortune(birthday: Int): String {
    return when (birthday) {
        in 1..7 -> "You will have a great day!"
        28, 31 -> "Things will go well for you today."
        else -> {
            val fortunes = listOf(
                "Enjoy a wonderful day of success.",
                "Be humble and all will turn out well.",
                "Today is a good day for exercising restraint.",
                "Take it easy and enjoy life!",
                "Treasure your friends because they are your greatest fortune."
            )
            fortunes[birthday % fortunes.size]
        }
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return (readlnOrNull() ?: "").toIntOrNull() ?: 1
}