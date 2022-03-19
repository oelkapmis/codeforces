fun main(){

    val (n, k) = readLine()!!.split(" ").map{it.toInt()}
    val arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    var count = 0
    for(i in arr){
        if(i + k <= 5) count++
    }
    println(count/3)
}
