package classes

class MovieJavaWay {
    val name: String
    val releaseYear: Int
    val genre: String

    constructor(name: String, releaseYear: Int, genre: String) {
        this.name = name
        this.releaseYear = releaseYear
        this.genre = genre
    }
}


fun main(args: Array<String>) {
    val movie = MovieJavaWay("The Grandfather", 1972, "Drama")
    println("${movie.name} was released in ${movie.releaseYear} and the genre is ${movie.genre}")
}