import kotlin.math.pow

fun main(){
 println("What was the principal amount of the account?")
 val principal = Integer.valueOf(readline())
 println("What was the annual interest rate of the account?")
 val interest rate = Integer.valueOf(readline())
 val double rate = Integer.value0f(readline())
 println("How many times each year was there a compound interest?")
 val compoundEachYear = Integer.valueOf(readline())
 println("How many years have you had the bank account?")
 val numOfYears = Integer.valueOf(readline())
 
 val base = ((principal*(1+((doubleRate/100)/compoundEachYear))))
 val exponent = compoundEachYear * numOfYears
 val amount = base.pow(exponent)
 println("Final amount is $amount")
}
