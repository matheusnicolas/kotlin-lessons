package classes

class MovieKotlinWay(val name: String, val releaseYear: Int, val genre: String)

fun main(args: Array<String>) {
    val movie = MovieKotlinWay("Monsters Inc", 2001, "Comedy")
    println("${movie.name} was released in ${movie.releaseYear} and the genre is ${movie.genre}")
}