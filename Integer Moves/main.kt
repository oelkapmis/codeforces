fun main() {

    var t = readLine()!!.toInt()
    var distance = 0.0
    var copy = 0

    while (t > 0) {

        val (x, y) = readLine()!!.split(" ").map { it.toInt() }

        if (x == 0 && y == 0) {
            println(0)
        } else {
            distance = kotlin.math.sqrt(((x * x) + (y * y)).toDouble())
            copy = distance.toInt()
            if (copy.toDouble() == distance) {
                println(1)
            } else {
                println(2)
            }
        }

        t--
    }
}