fun main() {

    var t = readLine()!!.toInt()

    while (t > 0) {
        var n = readLine()!!.toInt()
        val arr = readLine()!!.split(" ").map { it.toInt() }
        var x1 = 0;
        var c1 = 0
        var x2 = 0;
        var c2 = 0

        for (i in arr.indices) {
            if (i == 0) {
                x1 = arr[i]
                c1++
            } else if (arr[i] == x1) {
                c1++
            } else {
                x2 = arr[i]
                c2++
            }

            if (c1 > 0 && c2 > 0 && (c1 + c2 > 2)) break
        }

        if (c1 == 1) println(arr.indexOf(x1)+1)
        else println(arr.indexOf(x2)+1)

        t--
    }
}
