fun main(){

    val t = readLine()!!.toInt()
    var n: Int
    var str: String
    val mySet = mutableSetOf<Char>()
    var prevSize: Int

    loop@for(j in 0 until t){

        n = readLine()!!.toInt()
        str = readLine()!!
        prevSize = 0
        mySet.clear()

        for(i in str.indices){
            prevSize = mySet.size
            mySet.add(str[i])
            if(mySet.size == prevSize && str[i-1] != str[i]){
                println("NO")
                continue@loop
            }
        }
        println("YES")
    }

}