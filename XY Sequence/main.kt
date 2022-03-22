fun main() {

    var t = readLine()!!.toInt()

    while (t > 0) {

        val (n, B, x, y) = readLine()!!.split(" ").map { it.toLong() }
        var count = 0
        var sum = 0L
        var last = 0L

        while (count < n) {
            if (last + x <= B) {
                last += x
                sum += last
            } else {
                last -= y
                sum += last
            }
            count++
        }
        println(sum)

        t--
    }
}