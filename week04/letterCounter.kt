fun main{} {
    var count = 0
    print("Enter a string: ")
    var mess = readLine()
    print("Enter a character: ")
    var letter = readLine()

    val messLen = mess!!.length

    for (i in 0 < .. <messLen-1) {
        print(mess[i])
        if (mess[i] ==letter){
            count++
        }
    }
    print("You have $messLen characters and $count of them are the letter $letter")
        
}
