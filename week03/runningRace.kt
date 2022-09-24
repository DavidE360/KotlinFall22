fun main(args: Array<String>) {

        println("Enter name and time: ")
        val string = readLine()
        println("You entered this: $string")
    println("Runner: " + runner1)
    println("Time: " + time1)
    println("Runner: " + runner2)
    println("Time: " + time2)
    println("Runner: " + runner3)
    println("Time: " + time3)

    if (time1 >= time2) {
        if (time2 >= time3)
            println("In order" + runner3 + " " + runner2 + " " + runner1)
         else if (time3 >= time1)
            println("In order" + runner2 + " " + runner1 + " " + runner3)
        else if (time1 >= time3)
            println("In order" + runner2 + " " + runner3 + " " + runner1)
    } else{
        if (time3 >= time2)
            println("In order" + runner1 + " " + runner2 + " " + runner3)
        else if (time3 >= time1)
            println("In order" + runner1 + " " + runner3 + " " + runner2)
        else if (time1 >= time3)
            println("In order" + runner3 + " " + runner1 + " " + runner2)
        }

        }
    }
}
