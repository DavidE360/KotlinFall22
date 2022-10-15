fun main(){
    println("What is the name of the first runner?")
    var rn1 = readLine()!!
    println("How many minutes did it take them to finish the race? ")
    var min1 = Integer.valueOf(readLine()!!)
    println("What is the name of the second runner?")
    var rn2 = readLine()!!
    println("How many minutes did it take them to finish the race? ")
    var min2 = Integer.valueOf(readLine()!!)
    println("What is the name of the third runner?")
    var rn3 = readLine()!!
    println("How many minutes did it take them to finish the race? ")
    var min3 = Integer.valueOf(readLine()!!)

    var tempName: String
    var tempMin: Int

    if (min1 > min2){
        tempName = rn1
        tempMin = min1
        min1 = min2
        rn1 = rn2
        min2 = tempMin
        rn2 = tempName
    }
    if (min2 > min3){
        tempName = rn2
        tempMin = min2
        rn2 = rn3
        min2 = min3
        rn3 = tempName
        min3 = tempMin
    }
    if (min1 > min2){
        tempName = rn1
        tempMin = min1
        min1 = min2
        rn1 = rn2
        min2 = tempMin
        rn2 = tempName
    }
    println("The order of the runners are \n$rn1 as first \n$rn2 as second \n$rn3 as third.")
}
