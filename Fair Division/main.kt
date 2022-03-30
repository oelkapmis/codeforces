fun main() {

    var t = readLine()!!.toInt()

    while(t > 0){

        var n = readLine()!!.toInt()
        val weights = readLine()!!.split(" ").map { it.toInt() }
        var ones = 0
        var twos = 0
        weights.forEach { if(isEven(it)) twos++ else ones++ }
        val totalWeight = (twos * 2) + (ones)
        if(!isEven(totalWeight)) println("NO")
        else{
            val half = totalWeight/2
            if(isEven(half)){
                println("YES")
            }
            else{
                if(ones > 0)
                    println("YES")
                else
                    println("NO")
            }
        }

        t--
    }
}
fun isEven(num: Int): Boolean{
    return num % 2 == 0
}
