fun main() {

    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    var scoreSereja = 0
    var scoreDima = 0
    var turn: Boolean = true

    while(arr.isNotEmpty()){
        if(turn){
            if(arr.first() > arr.last()){
                scoreSereja += arr.first()
                arr.removeAt(0)
            }
            else{
                scoreSereja += arr.last()
                arr.removeAt(arr.lastIndex)
            }
            turn = false
        }
        else{
            if(arr.first() > arr.last()){
                scoreDima += arr.first()
                arr.removeAt(0)
            }
            else{
                scoreDima += arr.last()
                arr.removeAt(arr.lastIndex)
            }

            turn = true
        }
    }
    println("$scoreSereja $scoreDima")


}

