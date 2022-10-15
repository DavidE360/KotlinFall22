import kotlin.math.pow

fun main(){
    print("Enter your weight (in pounds): ")
    val weight = Integer.valueOf(readLine())
    print("Enter your height (in inches): ")
    val height = Integer.valueOf(readLine())
    val bmi = (weight*703)/height.toDouble().pow(2)

    var weightClass = ""
    if (bmi >= 18.5 && bmi <= 25){
        weightClass = "optimal weight"
    }
    if(bmi < 18.5){
        weightClass = "underweight"
    }
    if(bmi > 25){
        weightClass = "overweight"
    }
    print("Your bmi is $bmi and you are $weightClass")
}
