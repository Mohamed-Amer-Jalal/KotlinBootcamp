package classes.quiz

open class Book(val title: String, val author: String) {
    var currentPage: Int = 0

    open fun readPage() {
        currentPage++
    }
}

class EBook(title: String, author: String, val format: String = "text") : Book(title, author) {
    var wordCount: Int = 0

    override fun readPage() {
        // Assuming an average of 250 words per page for eBooks
        wordCount += 250
    }
}

fun main() {
    // Example usage
    val physicalBook = Book(title = "The Great Gatsby", author = "F. Scott Fitzgerald")
    physicalBook.readPage()
    println("Current Page of ${physicalBook.title}: ${physicalBook.currentPage}")

    val electronicBook = EBook(title = "The Lord of the Rings", author = "J.R.R. Tolkien")
    electronicBook.readPage()
    println("Word Count of ${electronicBook.title}: ${electronicBook.wordCount}")
}