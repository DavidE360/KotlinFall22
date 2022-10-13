fun main(){
    println("What is the name of your favorite city?")
    val userInput = readLine()
    if (userInput != null) {
        println("The number of characters in the city name are " + userInput.length)
        println("The name of the city in upper case letters is " +userInput.uppercase())
        println("The name of the city in lower case letters is " +userInput.lowercase())
        println("The first character in the name of the city is " +userInput.first())
    }
}
