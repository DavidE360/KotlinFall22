fun main() {
    println("How many shares?")
    val numberOfShares = readLine()!!.toInt()
    println("What was the price per share?")
    val purchasePrice = readLine()!!.toDouble()
    println("What was the commission?")
    val purchaseCommission = readLine()!!.toDouble()
    println("What was the sale price per share?")
    val salePricePerShare = readLine()!!.toDouble()
    println("What was the sales commission?")
    val salesCommission = readLine()!!.toDouble()

    val finalAmount = profit(numberOfShares,purchasePrice,purchaseCommission,salePricePerShare,salesCommission)

    if(finalAmount > 0)
        println("The profit you made was $$finalAmount")
    else
        println("The loss you had was $$finalAmount")
}

fun profit(numberOfShares : Int,purchasePrice : Double,purchaseCommission :Double,salePricePerShare : Double,salesCommission : Double) : Double{
    return ((numberOfShares*salePricePerShare)-salesCommission)-((numberOfShares*purchasePrice)+purchaseCommission)
}
