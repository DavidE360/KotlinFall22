fun main() {
  
  val randomNumber = (Math.random()*20).toInt()
  println("Enter a guess number: ")
  var playNumber = Integer.valueOf(readLine())
  while (playerNumber != randomNumber){
    if(playerNumber > randomNumber){
      println("Too high, try again")
      playernumber = Integer.valueOf(readLine())
    }
    else{
      println("Too low, try again")
      playerNumber = Integer.valueOf(readLine())
    }
  }
  println("Congrats you got the right number!")
}
