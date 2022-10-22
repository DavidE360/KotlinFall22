fun main() {
  println("What is the item's wholesale cost?")
  val wholesaleCost = readLine()!!.toDouble()
  println("What is the item's markup percentage?")
  val markupPercentage = readLine()!!.toDouble()
  println("Your final cost is $" calculateRetail(wholesaleCost, markupPercentage))
}
fun caluclateRetail(wholesaleCost: Double, markupPercentage: Double): Double{
  return (wholesaleCast*((markupPercentage/100)+1))
}
