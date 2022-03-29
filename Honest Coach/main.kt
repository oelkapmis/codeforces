import kotlin.math.abs

fun main() {

    var t = readLine()!!.toInt()

    while(t > 0){
        var min = Int.MAX_VALUE
        var n = readLine()!!.toInt()
        val arr = readLine()!!.split(" ").map{it.toInt()}.sorted()

        for(i in 0 until arr.lastIndex){
            if(abs(arr[i] - arr[i+1]) < min){
                min = abs(arr[i] - arr[i+1])
                if(min == 0) break
            }
        }
        println(min)

        t--
    }



}
