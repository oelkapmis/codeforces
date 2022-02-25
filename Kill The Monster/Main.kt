import java.lang.Math.ceil
 
fun main() {
 
    var t = readLine()!!.toInt()
    var upgrades : MutableList<Long> = mutableListOf()
    var c: MutableList<Long> = mutableListOf()
    var m: MutableList<Long> = mutableListOf()
 
    loop@while(t >0){
        c.clear()
        m.clear()
        upgrades.clear()
 
        c = readLine()!!.split(" ").map { it.toLong() }.toMutableList()
        m = readLine()!!.split(" ").map { it.toLong() }.toMutableList()
        upgrades = readLine()!!.split(" ").map { it.toLong() }.toMutableList()
 
        //println(c)
        //println(m)
 
        if(isSuccess(c[0], c[1], m[0], m[1])){
            //println("${c[0]}, ${c[1]}, ${m[0]}, ${m[1]}")
            println("YES")
            t--
            continue
        }
        else{
            var k = upgrades[0]
            for(i in 0 .. k){
                if(isSuccess(c[0]+((k-i)*upgrades[2]), c[1]+(i*upgrades[1]), m[0], m[1])){
                    //println("${c[0]+((k-i)*upgrades[2])}, ${c[1]+(i*upgrades[1])}, ${m[0]}, ${m[1]}")
                    println("YES")
                    t--
                    continue@loop
                }
            }
        }
 
        println("NO")
        t--
    }
    
}
 
fun isSuccess(cH: Long, cD: Long, mH: Long, mD: Long): Boolean{
    return ceil(mH.toDouble() / cD) <= ceil(cH.toDouble() / mD)
}
