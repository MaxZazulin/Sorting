fun main () {
    var list: Array<Int> = arrayOf(1,3,2,5,1,8,4,2,7,4)
    println("Initial data")
    list.forEach { name -> print(name) }
    println("\nResult")
}
fun bubbleSort(array: Array<Int>) {
    var buffer : Int = 0
    for (i in 0..array.size) {
        if (array[i] > array[i+1])
            buffer = array[i]
            array[i] = array[i+1]
            array[i+1] = buffer
    }
}