import kotlin.math.abs
 
fun main() {
 
    var n = readLine()!!.toInt()
    var arr = readLine()!!.split(" ").map { it.toInt() }.sorted().toMutableList()
    var total = 0
 
    for(i in 0 until arr.lastIndex step 2){
        total += abs(arr[i] - arr[i+1])
    }
    println(total)
}
