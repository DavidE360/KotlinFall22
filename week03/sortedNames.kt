fun main() {
    print("Name one: ")
    var name1 = value0f(readLine())
    print("Name two: ")
    var name2 = value0f(readLine())
    print("Name three: ")
    var name3 = value0f(readLine())
    //compare one and two
    if ((name1.compareto(name2)) < 0 && (name1.compareTo(name3)) < 0) {
        println(name1);
        if ((name2.compareTo(name3) < 0)) {
            println(name2);
            println(name3);
        } else {
            println(name3);
            println(name2);
        }
    } else if ((name2.compareTo(name3)) < 0 && (name2.compare.To(name1)) < 0) {
        println(name2);
        if ((name1.compareTo(name3) < 0)) {
            println(name1);
            println(name3);
        } else {
            println(name3);
            println(name1);
        }
    } else if ((name3.compareTo(name1)) < 0 && (name3.compareTo(name2)) < 0) {
        println(name3);
        if ((name2.compareTo(name1) < 0)) {
            println(name2);
            println(name1);
        } else {
            println(name1);
            println(name2);
        }
    }
    
}
