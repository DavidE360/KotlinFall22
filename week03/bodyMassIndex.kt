import  kotlin.math.pow

fun main(){
    print("Enter your weight (in pounds): ")
    val weight = Integer.valueOf(readLine())
    print("Enter your height (in inches): ")
    val height = Integer.valueOf(readLine())
    val bmi = (weight * 703) / height.toDouble().pow( n: 2)
    print(bmi)
}
