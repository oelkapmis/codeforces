fun main(){

    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }
    var count1 = 0
    var count2 = 0
    var count3 = 0
    var min = 0
    var indices1 = mutableListOf<Int>()
    var indices2 = mutableListOf<Int>()
    var indices3 = mutableListOf<Int>()

    for(i in arr.indices){
        if(arr[i] == 1){
            count1++
            indices1.add(i)
        }
        else if(arr[i] == 2){
            count2++
            indices2.add(i)
        }
        else{
            count3++
            indices3.add(i)
        }
    }

    min = minOf(minOf(count1, count2), count3)

    println(min)
    for(i in 0 until min){
        println("${indices1[i]+1} ${indices2[i]+1} ${indices3[i]+1}")
    }


}
