/* Author      : Maxim Zazulin */
fun main () {
    println("Checking!!!\n")
    println("Check BubbleSort")
    println("//============================//")
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
    println("//============================//")
    println("\nCheck StupitSort")
    println("//============================//")
    var list2: Array<Int> = arrayOf(1, 3, 2, 5, 1, 8, 4, 2, 7, 4)
    val otvet2: Array<Int> = arrayOf(1, 1, 2, 2, 3, 4, 4, 5, 7, 8)
    println("Initial data")
    list2.forEach { name -> print(name) }
    println("\nResult")
    list2 = stupitSort(list)
    list2.forEach { name -> print(name) }
    if (list2.contentEquals(otvet2))
        println("\nSUCCESSFUL")
    else
        println("\nFAIL")
    println("//============================//")
    println("\nCheck CocktailSort")
    println("//============================//")
    var list3: Array<Int> = arrayOf(1, 3, 2, 5, 1, 8, 4, 2, 7, 4)
    val otvet3: Array<Int> = arrayOf(1, 1, 2, 2, 3, 4, 4, 5, 7, 8)
    println("Initial data")
    list3.forEach { name -> print(name) }
    println("\nResult")
    list3 = sheikerSort(list)
    list3.forEach { name -> print(name) }
    if (list3.contentEquals(otvet3)) {
        println("\nSUCCESSFUL")
    } else
        println("\nFAIL")
    println("//============================//")
}

fun bubbleSort(array: Array<Int>): Array<Int> {
    var buffer : Int
    for (j in array.size - 2 downTo 0)
        for (i in 0..j)
            if (array[i] > array[i + 1]) {
                buffer = array[i]
                array[i] = array[i + 1]
                array[i + 1] = buffer
            }
    return array
}
fun stupitSort(array: Array<Int>): Array<Int> {
    val buffer : Int
    for (i in 0..array.size - 2)
        if (array[i] > array[i+1]) {
            buffer = array[i]
            array[i] = array[i + 1]
            array[i + 1] = buffer
            stupitSort(array)
            break
        }
    return array
}
fun sheikerSort(array: Array<Int>): Array<Int> {
    var buffer : Int
    var min = 0; var max = array.size-1
    while (min == max + 1) {
        for (i in min..max)
            if (array[i] > array[i + 1]) {
                buffer = array[i]
                array[i] = array[i + 1]
                array[i + 1] = buffer
            }
        min++
        for (j in max downTo min)
            if (array[j] > array[j + 1]) {
                buffer = array[j]
                array[j] = array[j + 1]
                array[j + 1] = buffer
            }
        max--
    }
    return array
}

