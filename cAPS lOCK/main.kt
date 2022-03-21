fun main() {

        val str = readLine()!!

        if (isAccident(str.substring(1)))
            println(changeCases(str))
        else
            println(str)

}

fun isAccident(substring: String): Boolean {
    if(substring.isEmpty()) return true
    for(i in substring) if (i.isLowerCase()) return false

    return true
}

fun changeCases(str: String): String{

    val copyStr = StringBuilder()

    for(i in str){
        if(i.isLowerCase()){
            copyStr.append(i.toUpperCase())
        }
        else{
            copyStr.append(i.toLowerCase())
        }
    }
    return copyStr.toString()
}