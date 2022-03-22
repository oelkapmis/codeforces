fun main() {

    var t = readLine()!!.toInt()

    while (t > 0) {

        val (n, m) = readLine()!!.split(" ").map { it.toInt() }

        if (n % 2 == 0 && m % 2 == 0) {
            println(n * m / 2)
        } else if (n % 2 == 1 && m % 2 == 1) {
            println(((n - 1) * m / 2) + (m + 1) / 2)
        } else {
            val even = if (n % 2 == 0) n else m
            val odd = if (n % 2 == 1) n else m

            println(even * ((odd - 1) / 2) + (even / 2))
        }

        t--
    }
}