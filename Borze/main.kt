fun main(){

    val code = readLine()!!
    var i = 0

    while(i < code.length){
        if(code[i] == '.') print(0)
        else{
            if(code[i+1] == '.') print(1)
            else print(2)
            i++
        }

        i++
    }

}


