fun main() {

    val n = readLine()!!.toInt()

    if(n % 2 == 0){
        println(n / 2)
        repeat(n / 2){
            print("2 ")
        }
    }
    else{
        println(n / 2)
        repeat((n/2)-1){
            print("2 ")
        }
        print("3")
    }
}
