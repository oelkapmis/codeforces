fun main(){

    val x = readLine()!!.toInt()
    val binary = Integer.toBinaryString(x)
    var cnt = 0
    for(i in binary)
        if(i == '1') cnt++

    println(cnt)

}