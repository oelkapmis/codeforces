fun main(){

    var t = readLine()!!.toInt()
    val arr = mutableListOf<Int>()
    var index: Int

    initArr(arr)

    while(t > 0){
        index = readLine()!!.toInt()
        println(arr[index-1])
        t--
    }

}

fun initArr(arr: MutableList<Int>) {
    var i = 1
    while(arr.size < 1000){
        if(i % 3 != 0 && i % 10 != 3)
            arr.add(i)
        i++
    }
}
