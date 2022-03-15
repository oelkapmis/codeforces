fun main(){

    var t = readLine()!!.toInt()
    var s: String
    var c: Char

    while(t > 0){

        s = readLine()!!
        c = readLine()!![0]

        if(!s.contains(c)){
            println("NO")
        }
        else{
            if(isPossible(s, c))
                println("YES")
            else
                println("NO")
        }
        t--
    }
}

fun isPossible(s: String, c: Char): Boolean {
    for(i in s.indices){
        if(s[i] == c && (i % 2) == 0)
            return true
    }
    return false
}
