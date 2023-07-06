package functions

fun <E> filter(list: List<E>, filter: (E) -> Boolean): List<E> {
    val filteredList = ArrayList<E>()
    for (element in list) {
        if (filter(element)) {
            filteredList.add(element);
        }
    }
    return filteredList
}

fun withSevenCharsAtLeast(name: String): Boolean {
    return name.length >= 7
}

fun main(args: Array<String>) {
    val listOfTeams = listOf("Botafogo", "Flamengo", "Vasco", "Palmeiras", "Grêmio")
    print(filter(listOfTeams, ::withSevenCharsAtLeast))
}