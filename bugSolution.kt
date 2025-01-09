fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(list)

    //Alternative solution: creating a new list
    val newList = list.filter { it % 2 != 0 }
    println(newList)
}