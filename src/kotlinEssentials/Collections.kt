package kotlinEssentials

fun main() {
    val testList = listOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

    println(testList.reversed()) // kotlin libraries

    println(reverseList(testList)) // fun reverseList
    println(reverseListAgain(testList)) // fun reverseListAgain
    /*------------------------------------------------*/
    val symptoms = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")

    symptoms.add("white fungus") // false
    symptoms.remove("red spots") // true

    println(symptoms.subList(4, symptoms.size )) // [belly up]
    listOf(1, 5, 3).sum() // 9
    listOf("a", "b", "cc").sumOf { it.length } //4
    /*------------------------------------------------*/
    val cures = mapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(cures["white spots"])

    println(cures.getOrDefault("bloating", "sorry I don't know"))
    cures.getOrElse("bloating") { "No cure for this" }

    val inventory = mutableMapOf("fish net" to 1)
    inventory["tank scrubber"] = 3
    inventory.remove("fish net")
}

fun reverseList(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in list.indices) { result.add(list[list.size-i-1]) }
    return result
}

fun reverseListAgain(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in list.size - 1 downTo 0) { result.add(list[i]) }
    return result
}