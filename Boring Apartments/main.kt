fun main(){

    var t = readLine()!!.toInt()
    var apartment: String
    var sum: Int

    while(t > 0){

        apartment = readLine()!!
        sum = 0

        //we can get the numeric value of apartment[0] by this way:
        //sum = ((Character.getNumericValue(apartment[0])-1) * 10)
        //or we can basically just subtract character '0' from it and get the integer equivalent of this value
        sum = (apartment[0]-'0' - 1) * 10
        sum += apartment.length * (apartment.length + 1) / 2
        println(sum)

        t--
    }
}


