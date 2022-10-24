fun main(){
    for (i in 0..20){
        println("$i degrees in Fahrenheit is " + celsius(i.toDouble()) + " degrees in celsius.")
    }
}
fun celsius(fahrenheit : Double) : Double{
    return (fahrenheit-32)*(5.0/9)
}
