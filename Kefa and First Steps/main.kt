fun main(){

    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }
    var currentMax = 1
    var candidateMax = 1

    for(i in 0 until n-1){

        if(arr.size == 1){
            println(1)
            return
        }

        if(i+1 < n && arr[i+1] >= arr[i]){
            candidateMax++

            if(candidateMax > currentMax){
                currentMax = candidateMax
            }
        }
        else{
            candidateMax = 1
        }
    }

    println(currentMax)
}


