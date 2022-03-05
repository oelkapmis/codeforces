import kotlin.math.pow

fun main(){

    var t = readLine()!!.toInt()

    while(t > 0){
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }

        println(minOf(maxOf(a, 2 * b).toDouble(), maxOf(2 * a, b).toDouble()).pow(2).toInt())

        t--
    }

}
