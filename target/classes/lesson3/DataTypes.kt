package lesson3

import java_classes.DummyClass

class DataTypes {
    //when we assign a number to a variable it is being defined as Integer
}

fun main() {
    val myInt=10
    var myLong=22L//L is exists here also

    myLong=myInt.toLong() //we can't do it like java we have to use toLong() method
    //kotlin does not do auto widening
    val myByte:Byte =111
    val myShort:Short
    myShort=myByte.toShort()

    val anotherInt=5

    var myDouble=23.433 //double is also default
    println(myDouble is Double)

    val myFloat=134.542324f
    println("This is a float : ${myFloat is Float}")
    myDouble=myFloat.toDouble()
    //There is not auto widening we have to do "explicitly widening"

    val char='b'
    val myChar=65 //compiler defines that as Integer
    //we can't assign numeric to char in Kotlin
    println(myChar.toChar())//we can do explicitly narrow to assign an ascii value to char

    var myBoolean=true
    val vacationTime=false
//We called a java method with primitive parameter from kotlin class without creating object
    val onVacation= DummyClass().isVacationtime(vacationTime)
    println(onVacation)
    val anything:Any


}