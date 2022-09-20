  // David Emokpae
// 2.8 String Manipulator

fun main(){
    print("Enter the name of your favorite city: ")
    val favCity = readLine()
    println("You said $favCity")

    val cityLen = favCity!!.length
    var upperCity = favCity.uppercase()
    val lowerCity = favCity.lowercase()
    val firstletter = favCity[0]

    println("You city is $cityLen letters long.")
    println("You can shout $upperCity all day long!")
    println("Or whisper $lowerCity at night...")
    print("Your city begins with the letter $firstletter.")
}
