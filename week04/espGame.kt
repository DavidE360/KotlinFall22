fun main(){
  
  val colorsList = ListOf("Red, Green, Blue, Orange, Yellow")
  var Count = 0
  for(i in 1 until 10){
    val randomNumber = (Math.random()*5).toInt()
    val computerRepeat = colorsList[randomNumber]
    println("Enter guess Number: ")
    val playerGuess = readLine()!!
    println("The color was $computerRepeat")
    if(playerGuess.equals(computerGuess, ignoreCase = true)){
      Count += 1  
    }
  }
  println("The user used correct color $computerRepeat number of times.")
}
