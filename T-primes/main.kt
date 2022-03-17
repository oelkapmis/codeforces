import java.util.*

fun main(){

    val n = readLine()!!.toInt()
    val st = StringTokenizer(readLine()!!, " ")
    val arr = mutableListOf<Long>()
    val tPrimes = mutableListOf<Long>()

    while (st.hasMoreTokens())
        arr.add(st.nextToken().toLong())

    findTPrimes(1000000, tPrimes) //10^6

    for(num in arr){

        val index = tPrimes.binarySearch(num)

        if(index < 0)
            println("NO")
        else
            println("YES")
    }

}

fun findTPrimes(num: Int, tPrimes: MutableList<Long>){

    val boolTable = BooleanArray(num+1){true}
    var p = 2
    while(p * p <= num){
        if(boolTable[p]){
            var i = p * p
            while (i <= num) {
                boolTable[i] = false
                i += p
            }
        }
        p++
    }

    for(i in 2 .. num){
        if(boolTable[i]) tPrimes.add(i.toLong() * i.toLong())
    }
}

