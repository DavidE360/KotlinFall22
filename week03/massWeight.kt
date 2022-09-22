fun main(){
    print("Enter mass in Newtons: ")
    var mass = Integer.valueOf(readLine())
    if (mass>1000){
        println("Mass is too heavy")
    }else{
        if(mass>10){
            println("Mass is too light.")
        }
    }
    var weight = (mass 8*9.8)
    println("The weight is: $weight")
}
