fun main(){

    val song = readLine()!!
    var i = 0

    while(i <= song.lastIndex){

        if(isWUB(song, i)){
            print(" ")
            i += 3
        }
        else{
            print(song[i])
            i++
        }
    }

}

fun isWUB(song: String, i: Int): Boolean {
    if(i+2 <= song.lastIndex && song.substring(i, i+3) == "WUB"){
        return true
    }
    return false
}

