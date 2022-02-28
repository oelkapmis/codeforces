fun main() {

    var t = readLine()!!.toInt()
    var arrA = mutableListOf<Int>()
    var arrB = mutableListOf<Int>()
    var sum: Int

    while(t > 0){
        sum = 0
        val (n, k) = readLine()!!.split(" ").map { it.toInt() }
        arrA = readLine()!!.split(" ").map { it.toInt() }.sorted().toMutableList()
        arrB = readLine()!!.split(" ").map { it.toInt() }.sortedDescending().toMutableList()

        for(i in 0 until k){
            sum += if(arrB[i] > arrA[i])
                arrB[i]
            else
                arrA[i]
        }


        for(i in k until n)
            sum += arrA[i]

        println(sum)
        t--
    }
}
