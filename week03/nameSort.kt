fun main(){
    println("Enter the first name >> ")
    var firstName = readLine()!!
    println("Enter the second name >> ")
    var secondName = readLine()!!
    println("Enter the third name >> ")
    var thirdName = readLine()!!

    if(firstName > secondName){
        val temp = firstName
        firstName = secondName
        secondName = temp
    }
    if (secondName > thirdName){
        val temp = secondName
        secondName = thirdName
        thirdName = temp
    }
    if(firstName > secondName){
        val temp = firstName
        firstName = secondName
        secondName = temp
    }


    println("The names ascending is $firstName $secondName $thirdName"  )
    println("The names descending is $thirdName $secondName $firstName " )

}
