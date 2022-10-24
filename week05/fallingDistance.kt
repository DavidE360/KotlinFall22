import kotlin.math.pow

fun main(){
    for(i in 1..10){
        println("At $i seconds the object has fallen " + fallingDistance(i) + " meters.")
    }
}
fun fallingDistance(time : Int) : Double{
    return .5*(9.8*(time.toDouble().pow(2.0)))
}
