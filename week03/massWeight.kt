fun main(){
    println("Enter the mass of an object")
    var mass = Integer.valueOf(readLine())
    var weight = mass * 9.8

    println("The weight is $weight")

    if (weight > 1000){
        println("Object is too heavy")
    }

    if(weight <10){
        println("Object is too light")
    }
}
