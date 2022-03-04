fun main(){

    var n = readLine()!!.toInt()
    var mWin = 0
    var cWin = 0

    while(n > 0){
        val (m, c) = readLine()!!.split(" ").map { it.toInt() }
        if(m > c) mWin++
        else if(c > m) cWin++

        n--
    }

    if(mWin > cWin)
        println("Mishka")
    else if(cWin > mWin)
        println("Chris")
    else
        println("Friendship is magic!^^")

}
