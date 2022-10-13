fun main(0){
val cookiesinBag = 40
    val servingsinBag = 10
    val cookiesServed = ((cookiesinBag/servingsinBag))
    val caloriesServed = 300
    val caloriesinCookies = (caloriesServed/cookiesServed)
    
    println("Enter number of cookies eaten: ")
    val cookies = Integer.valueof(readLine())
    val total Calories = cookies * 75
    println("Your calorie intake was: $totalCalories calories.")
}
