package functions.quiz

fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    // Task 1: Filter curries and sort by string length
    val sortedCurries = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(sortedCurries)

    // Task 2: Filter spices starting with 'c' and ending with 'e' in two different ways
    val filteredSpices1 = spices.filter { it.startsWith('c') && it.endsWith('e') }
    val filteredSpices2 = spices.filter { it.first() == 'c' && it.last() == 'e' }
    println(filteredSpices1)
    println(filteredSpices2)

    // Task 3: Take the first three elements starting with 'c'
    val firstThreeCs = spices.take(3).filter { it.startsWith('c') }
    println(firstThreeCs)
}