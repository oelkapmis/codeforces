fun main(){

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    /*
         a + b + c   ----\  get max
         a * b * c   ----/  of these two   ------\
                                                  \ get max
                                                  / of these two
        (a + b)* c   ----\  get max        ------/
         a *(b + c)  ----/  of these two
     */

    println(maxOf(maxOf(a+b+c, a*b*c), maxOf((a+b)*c, a*(b+c))))

}
