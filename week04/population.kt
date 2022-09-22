fun main(){
    var start = 0.0
    var days = 0
    var population = 0.0

    print("Starting number of organism: ")
    val pupulation = Integer.valueOf(readLine())
    print("Average daily population increase (population): ")
    val increase = Integer.valueOf(readLine())
    print("Number of days they will multiply: ")
    val increase = Integer.valueOf(readLine())
    
    for (i in days){
        pupulation = population + (population * increase)
        print("Day $i: $population")
    }

}
