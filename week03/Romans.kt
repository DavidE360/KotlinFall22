fun main(){
    println("Enter a number between 1 & 10 >> ")
    var deviceInput = readLine()
    val deviceInt = deviceInput?.toInt()
    var romanNumeral: String = when(deviceInt){
        1 -> "I"
        2 -> "II"
        3 -> "III"
        4 -> "IV"
        5 -> "V"
        6 -> "VI"
        7 -> "VII"
        8 -> "VIII"
        9 -> "IX"
        10 -> "X"
        else -> "Error. The number is out of bounds"
    }
}
