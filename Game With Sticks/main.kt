fun main(){

    val (m, n) = readLine()!!.split(" ").map{it.toInt()}
    val counter = minOf(m, n)

    if(counter % 2 == 0)
        println("Malvika")
    else
        println("Akshat")
}