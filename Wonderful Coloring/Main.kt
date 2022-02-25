var str = mutableListOf<Char>()
fun main() {
    var t = readLine()!!.toInt()
    var count: Int
    var redCount: Int
    var toRemove = mutableListOf<Char>()
 
    while(t > 0){
        str = readLine()!!.toMutableList()
        redCount = 0
        toRemove.clear()
 
        for(i in str){
            if(getNum(i) < 2) continue
            else if(!toRemove.contains(i)){
                redCount++
                toRemove.add(i)
            }
        }
        for(i in toRemove){
            while(str.remove(i)){}
        }
 
        redCount += str.size / 2
        println(redCount)
 
        t--
    }
}
 
fun getNum(ch: Char): Int{
    var count = 0
 
    for(i in str)
        if(ch == i) count++
 
    return count
}
