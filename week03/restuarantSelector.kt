fun main(){
  
  println("Is anyone in your party a vegetarian?")
  val veggieChoice = readline()!!
  println("Is anyone in your party a vegan?")
  val veganChoice = readline()!!
  println("Is anyone in your party gluten-free?")
  val glutenChoice = readline()!!
  
  println("Here are your restaurant choices: ")
  
  if (veggieChoice.equals("Yes",ignoreCase = true)){
    if (veganChoice.equals("Yes", ignoreCase = true)){
      if(glutenChoice.equals("Yes", ignoreCase = true)){
        printCafe()
        printKitchen()
      }
    }
    else{
      if(glutenChoice.equals("Yes", ignoreCase = true)){
        printCompany()
      }
      else{
        printItalian()
      }
    }
  }
  
}

fun printJoe(){
  println("\Joe's Gourmet Burgers ")
}
fun printCompany(){
  println("\tMain Street Pizza Company ")
}
fun printItalian(){
  println("\tMama's Fine Italian ")
}
fun printKitchen(){
  println("\tThe Chef's Kitchen ")
}
