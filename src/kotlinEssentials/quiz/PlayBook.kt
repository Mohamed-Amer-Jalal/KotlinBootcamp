package kotlinEssentials.quiz

import kotlin.random.Random

class PlayBook(val title: String, var pages: Int)

fun PlayBook.weight(): Double {
    return pages * 1.5
}

fun PlayBook.tornPages(tornCount: Int) {
    if (tornCount in 1..pages) {
        pages -= tornCount
        println("$tornCount pages torn from $title. Remaining pages: $pages")
    } else {
        println("Invalid torn page count. No pages torn from $title.")
    }
}

class Puppy(val name: String) {
    fun playWithBook(book: PlayBook) {
        val tornCount = Random.nextInt(1, book.pages + 1)
        book.tornPages(tornCount)
        if (book.pages == 0) {
            println("$name has torn all pages from the book ${book.title}. Playtime is over!")
        }
    }
}

fun main() {
    val book = PlayBook(title = "The Adventures of Sherlock Holmes", pages = 200)
    val puppy = Puppy(name = "Buddy")

    println("Initial Book Weight: ${book.weight()} grams")

    while (book.pages > 0) {
        puppy.playWithBook(book)
    }

    println("Final Book Weight: ${book.weight()} grams")
}