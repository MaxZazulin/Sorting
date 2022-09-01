/* Author      : Maxim Zazulin */
fun main () {
    var list: Array<Int> = arrayOf(1, 3, 2, 5, 1, 8, 4, 2, 7, 4)
    val otvet: Array<Int> = arrayOf(1, 1, 2, 2, 3, 4, 4, 5, 7, 8)
    println("Initial data")
    list.forEach { name -> print(name) }
    println("\nResult")
    list = bubbleSort(list)
    list.forEach { name -> print(name) }
    if (list.contentEquals(otvet))
        println("\nSUCCESSFUL")
    else
        println("\nFAIL")
}
fun bubbleSort(array: Array<Int>): Array<Int> {
    var buffer : Int
    for (schetchik in array.size - 2 downTo 0)
        for (i in 0..schetchik)
            if (array[i] > array[i + 1]) {
                buffer = array[i]
                array[i] = array[i + 1]
                array[i + 1] = buffer
            }
    return array
}

