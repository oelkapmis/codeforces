fun main() {

    /* n:  0
       k:  1
       l:  2
       c:  3
       d:  4
       p:  5
       nl: 6
       np: 7
    */
    val input = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    val drink: Int = (input[1] * input[2]) / input[6]
    val limes: Int = input[3] * input[4]
    val salt: Int = input[5] / input[7]

    val min = minOf(drink, minOf(limes, salt))
    print(min/input[0])
}
