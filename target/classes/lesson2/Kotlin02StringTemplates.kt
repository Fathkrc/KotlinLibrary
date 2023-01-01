package lesson2

class Kotlin02StringTemplates {

}

fun main() {
    var employee1=Employee("Yaşar",12)
    println(employee1)
    val x=4.22
    println("To show the value of change, we use $$x")
    println("Your change is $$x")
    //We can get values inside String with '$' symbol after using dollar symbol we can call our variables
    val numerator=10.99
    val denominator=20.00
    println("The value of $numerator divided by $denominator is : ${numerator/denominator}")
    //We can also use like this
    println("The employee's ID is : ${employee1.id}")

}
