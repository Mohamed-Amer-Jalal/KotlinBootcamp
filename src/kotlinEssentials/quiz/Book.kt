package kotlinEssentials.quiz

class Book(val title: String, val author: String, val year: Int) {

    fun getTitleAndAuthor(): Pair<String, String> {
        return title to author
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}


fun main() {
    // Create a book instance
    val myBook = Book(title = "The Catcher in the Rye", author = "J.D. Salinger", year = 1951)

    // Get information using Pair
    val titleAndAuthor: Pair<String, String> = myBook.getTitleAndAuthor()
    println("Book Title: ${titleAndAuthor.first}, Author: ${titleAndAuthor.second}")

    // Get information using Triple
    val titleAuthorAndYear: Triple<String, String, Int> = myBook.getTitleAuthorYear()
    println("Here is your book ${titleAuthorAndYear.first} written by ${titleAuthorAndYear.second} in ${titleAuthorAndYear.third}.")

    /*====================================================================================================================*/
    // Create a Set of book titles
    val allBooks = setOf("Hamlet", "Romeo and Juliet", "Macbeth")

    // Create a Map associating the set of books to the author
    val library = mapOf("William Shakespeare" to allBooks)

    // Use any() to check if any book is "Hamlet"
    val isHamletInLibrary = library.any { it.value.contains("Hamlet") }
    println("Is Hamlet in the library? $isHamletInLibrary")

    // Create a MutableMap and add one title/author to it
    val moreBooks = mutableMapOf("Charles Dickens" to setOf("Great Expectations"))

    // Use getOrPut() to add a title if it's not in the map
    moreBooks.getOrPut("Jane Austen") { setOf("Pride and Prejudice") }

    // Print the updated moreBooks map
    println("More Books: $moreBooks")
}