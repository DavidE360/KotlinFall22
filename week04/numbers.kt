fun main(){

    println("Please enter a positive non zero value >> ")
    val userInput = Integer.valueOf(readLine())
    var SumNumber = 0
    for(i in 1 until  userInput+1){
        totalNumber += i
    }
    println("The sum of numbers from 1 to $userInput is >> ")
    println(SumNumber)
}
