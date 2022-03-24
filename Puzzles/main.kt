fun main() {

    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList().sortedDescending()
    var minDistance = Integer.MAX_VALUE

    for(i in 0..(arr.size - n) ){
        if(arr[i] - arr[i + (n - 1)] < minDistance){
            minDistance = arr[i] - arr[i + (n - 1)]
        }
        if(minDistance == n - 1) break
    }
    println(minDistance)
}

