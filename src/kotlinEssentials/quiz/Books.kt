package kotlinEssentials.quiz

const val MAX_BOOKS_BORROWED = 5

class Books(val title: String) {
    companion object Constants {
        const val BASE_URL = "https://librarycatalog.com/"
    }

    var booksBorrowed = 0

    fun canBorrow(): Boolean {
        return booksBorrowed < MAX_BOOKS_BORROWED
    }

    fun printUrl() {
        val url = "${BASE_URL}${title}.html"
        println("URL: $url")
    }
}

fun main() {
    val book1 = Books(title = "The Great Gatsby")
    val book2 = Books(title = "To Kill a Mockingbird")

    println("Can borrow ${book1.title}? ${book1.canBorrow()}") // true
    println("Can borrow ${book2.title}? ${book2.canBorrow()}") // true

    book1.booksBorrowed++
    book2.booksBorrowed += 2

    println("Can borrow ${book1.title}? ${book1.canBorrow()}") // false
    println("Can borrow ${book2.title}? ${book2.canBorrow()}") // true

    book1.printUrl()
    book2.printUrl()
}