import java.lang.Math.abs

fun main() {

    var t = readLine()!!.toInt()

    while(t > 0){

        val alphabet = readLine()!!
        val str = readLine()!!
        var time = 0

        if(str.length != 1){
            for(current in 0 until str.lastIndex){
                time += kotlin.math.abs(getIndexOf(str[current], alphabet) - getIndexOf(str[current + 1], alphabet))
            }
        }

        println(time)
        t--
    }
}

fun getIndexOf(char: Char, alphabet: String): Int{
    for(i in alphabet.indices)
        if(alphabet[i] == char) return i

    return -1
}
