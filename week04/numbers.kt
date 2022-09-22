fun main() {

    var sums = 0

    print("Enter a number: ")
    val number = Integer.valueOf(readLine())

    for (nums in 1< .. <number) {
        sums = sums + nums
    }

    print (sums)
}
