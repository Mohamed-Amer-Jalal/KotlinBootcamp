package functionalManipulation.quiz

typealias Predicate<T> = (T) -> Boolean

inline fun <reified T> List<T>.divisibleBy(crossinline predicate: Predicate<T>): List<T> = this.filter(predicate)

inline val <reified T> List<T>.divisibleBy: (Predicate<T>) -> List<T> get() = { predicate -> this.filter(predicate) }

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    val result = numbers.divisibleBy { it.rem(3) == 0 }

    println(result)
}