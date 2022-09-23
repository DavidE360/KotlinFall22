fun main(){
    
    baseFee = 10
    print("Enter number of cheks: ")
    val numOfChecks = Integer.valueOf(readLine())

    if (numOfChecks < 20) {
        total = (baseFee + numOfChecks * 0.10)
    } else if (numOfChecks >= 20 && numOfChecks <= 39) {
        total = (baseFee + numOfChecks * 0.0)
    } else if (numOfChecks >= 40 && numOfChecks <= 59) {
        total = (baseFee + numOfChecks * 0.06)
    } else {
        total = (baseFee + numOfChecks * 0.04)
    }


    println("Service fees for the month: ")

}
