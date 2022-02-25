import java.lang.Integer.max
import java.util.*
 
fun main() {
 
    var t = readLine()!!.toInt()
    var n: Int
    var m: Int
    var arr = mutableListOf<Int>()
 
    while(t > 0){
 
        m = 0
        n = readLine()!!.toInt()
 
        val st = StringTokenizer(readLine()!!, " ")
        while(st.hasMoreTokens())
            arr.add(st.nextToken().toInt())
 
        for(i in 1 until arr.lastIndex){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                if(i+2 < arr.lastIndex)
                    arr[i+1] = max(arr[i+2], arr[i])
                else
                    arr[i+1] = arr[i]
                m++
            }
        }
        println(m)
        printarr(arr)
 
        arr.clear()
        t--
    }
 
}
 
fun printarr(arr: MutableList<Int>) {
    for(i in arr)
        print("$i ")
    println()
}
