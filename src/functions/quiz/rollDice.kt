package functions.quiz

// Lambda expression for rolling a dice with default sides as 6
val rollDice = { (1..6).random() }

// Lambda expression with sides as an argument, returns 0 if sides is 0
val rollDiceWithSides = { sides: Int -> (1..sides).randomOrNull() ?: 0 }

// Using function type notation for the same lambda
val rollDice2 = { sides: Int -> if (sides > 0) (1..sides).random() else 0 }

// Function to play the game with any dice rolling function
fun gamePlay(rollDiceFunction: (Int) -> Int) {
    val diceRoll = rollDiceFunction(6) // Passing 6 as the default number of sides
    println("Dice roll result: $diceRoll")
}

fun main() {
    // Example usage
    gamePlay(rollDice2) // Calls gamePlay with rollDice2 function

    // Example usage
    println(rollDice())                   // Output: Random number between 1 and 6
    println(rollDiceWithSides)            // Output: Random number between 1 and 8
    println(rollDice2(10))                // Output: Random number between 1 and 10
}