fun main() {
 
    var t = readLine()!!.toInt()
    var n: Int
    var arr = mutableListOf<Int>()
 
    while(t > 0){
        n = readLine()!!.toInt()
        arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
 
        for(i in arr.indices){
            if(arr[i] - arr[i+1] != 0){
                println(getSpy(arr, i)+1)
                break
            }
        }
 
        arr.clear()
        t--
    }
}
 
fun getSpy(arr: MutableList<Int>, i: Int): Int {
    return when (i) {
        0 -> {
            if(arr[0] == arr[2]) 1
            else 0
        }
        arr.lastIndex-1 -> {
            if(arr.last() == arr[arr.lastIndex-2]) arr.lastIndex-1
            else arr.lastIndex
        }
        else -> {
            i+1
        }
    }
}
