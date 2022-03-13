fun main(){

    val n = readLine()!!.toInt()
    val cubes = readLine()!!.split(" ").map { it.toInt() }.sorted()

    for(i in cubes){
        print("$i ")
    }

}