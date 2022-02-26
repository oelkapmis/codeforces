fun main(args: Array<String>) {
 
	var t = readLine()!!.toInt()
	var n: Int
	var moves: Int
 
	while(t > 0){
		moves = 0
		n = readLine()!!.toInt()
 
		while(n != 1){
			if(n % 6 == 0){
				n /= 6
				moves++
			}
			else{
				n *= 2
				moves++
				if(n % 6 != 0){
					moves = -1
					break
				}
			}
		}
		println(moves)
		t--
	}
} 
