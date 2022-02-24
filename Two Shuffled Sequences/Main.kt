fun main() {
 
    var n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }.sorted().toMutableList()
    val arrCopy = mutableListOf<Int>()
 
    if(!isPossible(arr, arrCopy)) println("NO")
    else{
 
        println("YES")
        println(arrCopy.size)
        for(num in arrCopy){
            print(("$num "))
        }
        println()
 
        println(n- arrCopy.size)
        arr.reverse()
        for(num in arr){
            if(num != -1) print(("$num "))
        }
 
        println()
    }
 
}
 
fun isPossible(arr: MutableList<Int>, arrCopy: MutableList<Int>): Boolean {
    var count = 0
 
    for(i in 0 until arr.lastIndex){
        if(arr[i] == arr[i+1]){
            count++
            arrCopy.add(arr[i])
            arr[i] = -1
        }
        else count = 0
 
        if(count == 2) return false
    }
    return true
}
 
