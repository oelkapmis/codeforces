fun main(args: Array<String>){

    var t = readLine()!!.toInt()
    var str: String

    while(t > 0){
        str = readLine()!!

        if(str.indexOf('r',0,ignoreCase = false) < str.indexOf('R',0,ignoreCase = false) &&
            str.indexOf('g',0,ignoreCase = false) < str.indexOf('G',0,ignoreCase = false) &&
            str.indexOf('b',0,ignoreCase = false) < str.indexOf('B',0,ignoreCase = false)){
            println("YES")
            t--
            continue
        }

        println("NO")
        t--
    }

}