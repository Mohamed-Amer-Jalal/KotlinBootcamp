package kotlinEssentials

fun main() = labels()

fun labels() {
    loop@for (i in 1..100) {
        for (j in 1..100) {
            if (i > 10) { println("Good For") }
            break@loop }
    }
}