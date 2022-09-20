fun main(){
    print("Enter a two-digit month: ")
    var month = Integer.valueOf(readLine())
    print("Enter a two-digit day: ")
    var day = Integer.valueOf(readLine())
    print("Enter a two-digit day: ")
    var year = Integer.valueOf(readLine())

    println("You entered $month/$day/$year.")

    if(month*day==year){
        print("Your date is is a magic number!")
    }
}
