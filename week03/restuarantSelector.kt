fun main(){
// Aaryan Khan assignment number 03.7 Restaurant Selector 09/22/2022
    println("Is anyone in your party a vegetarian? ")
    val vegetChoice = readLine()!!
    println("Is anyone in your party a vegan? ")
    val veganChoice = readLine()!!
    println("Is anyone in your party gluten-free? ")
    val glutenChoice = readLine()!!

    println("Here are your restaurant choices:")

    if (vegetChoice.equals("yes",ignoreCase = true)){
        if (veganChoice.equals("yes",ignoreCase = true)){
            if(glutenChoice.equals("yes",ignoreCase = true)){
                printCafe()
                printKitchen()
            }
        }
        else{
            if(glutenChoice.equals("yes",ignoreCase = true)){
                printStreet()
            }
            else{
                printItalian()
            }
        }
    }

    else{
        if (veganChoice.equals("yes",ignoreCase = true)){
            if(glutenChoice.equals("yes",ignoreCase = true)){
            }
        }
        else{
            if(glutenChoice.equals("yes",ignoreCase = true)){
            }
            else{
                printJoe()
            }
        }
    }

}

fun printJoe(){
    println("\tJoe’s Gourmet Burgers ")
}
fun printStreet(){
    println("\tMain Street Pizza Company ")
}
fun printCafe(){
    println("\tCorner Café  ")
}
fun printItalian(){
    println("\tMama’s Fine Italian  ")
}
fun printKitchen(){
    println("\tThe Chef’s Kitchen ")
}
