// David Emokpae

fun main() {

    print("What is your name? ")
    val name: string? = readLine()

    // Introduction
    println(" Welcome, " + name + ", let us find adventure!")
    println("You find yourself on the edge of a dark forest.")
    println("Can you find your way through?")

    do {
        print("Would you like to step into the forest? ")
        val playnow: string? = readline()
        if (playnow == "no") {
            println("You are not ready for this game...") {
                break
            }
            println("To your left, you see a bear.")
            println("To your right, there is more forest.")
            println("There is a rock wall directly in front of you.")
            println("Behind you is the forest exit.")

            val direction: String? = readline()
            if (direction == "no") {
                println("You are not ready for this game...") {
                    break
                }

                println("To your left, you see a bear.")
                println("To your right, there is more forest.")
                println("There is a rock wall directly in front of you.")
                println("Behind you is the forest exit.")
                println("What direction do you move?")
                val response: string? = readLine()

                if (response == "left") {
                    println("The bear eats you, Farewell, " + name) {
                        break
                    }
                    else if (response == "right") {
                        println("You head deeper into the forest.")
                    }

                } while (response != "quit")


            }
        }
    }
}
