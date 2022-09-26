fun main(){

  println("Enter today's sales for store 1: ")
  var store 1 = Integer.valueOf(readline())
  println("Enter today's sales for store 2: ")
  var store 2 = Integer.valueOf(readline())
  println("Enter today's sales for store 3: ")
  var store 3 = Integer.valueOf(readline())
  println("Enter today's sales for store 4: ")
  var store 4 = Integer.valueOf(readline())
  println("Enter today's sales for store 5: ")
  var store 5 = Integer.valueOf(readline())
  
  print("SALES BAR CHART")
  
  print("Store 1: ")
  while (store1 >= 100){
    print("*")
    store1 -= 100
  }
  print("Store 2: ")
  while (store2 >= 100){
    print("*")
    store2-= 100
  }
  print("Store 3: ")
  while (store3 >= 100){
    print("*")
    store3 -= 100
  }
    print("Store 4: ")
  while (store4 >= 100){
    print("*")
    store4 -= 100
  }
    print("Store 5: ")
  while (store5 >= 100){
    print("*")
    store5 -= 100
  }
}
