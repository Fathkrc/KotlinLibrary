package lesson3

import java_classes.DummyClass

class Arrays02 {

}

fun main() {
    val mixedArray= arrayOf(12,"asdf",123L,'a')
    for(element in mixedArray){
        println(element)
    }
    println(mixedArray is Array<*>)

   // val myIntArray= arrayOf(3,4,2,5,1)//complaining java does not apply its an int array so
    val myIntArray= intArrayOf(3,4,2,5,1)//when we use intArrayOf() specific method java applies
    DummyClass().printNumbers(myIntArray)

    var someOtherArray=Array<Int>(5){0}//in this case we are calling Array construction and it has 2 parameter
    //Array<dataType>  "(size) and {assignment values}"

    var array1:Array<Int>//we can do this by Just declaring data type without calling constructor

    var someArrayInt=IntArray(5)
    //It works because IntArray method has default assignment value as 0
    for(number in someArrayInt){
        println(number)
    }
    println()
    val evenNumbers= Array<Int>(5){i->i*2}
    DummyClass().printNumbers(evenNumbers.toIntArray())


}