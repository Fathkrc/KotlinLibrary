package Challenges

import java_classes.DummyClass
import java.util.*

class Challenge2 {
}

fun main() {
    //Declare a non-nullable float variable 2 ways
    var long1=-3847.384f //this is the best use
    var long2:Float=-3847.384f
    val float3=-3847.384.toFloat()//not necessary
    //declare an array of non-nullable Short. make it size 5 and assign 1,2,3,4,5
    var arr1:Array<Short> = arrayOf(1,2,3,4,5) //Why does space so important I could not figure out
    var arr2= shortArrayOf(1,2,3,4,5)
   // println(Arrays.toString(arr1))
    //Declare a nullable Int array and initialize it with 5,10,15,20,25 etc.
    var arr3:Array<Int?> = Array (40){i->(i+1)*5}
  /*  for (number in arr3) {
        println(number)
    }*/
    // call a java method with following signature from Kotlin :
    //public void method1(char[] charArray) Declare an array that you could
    //pass to the method and initialize it with values a,b,c
   var charArray:Array<Char> =Array(6){'x'}
    DummyClass.method1(charArray.toCharArray())
    //Declare another string variable
    //assign it x.lowerCase() when x is null
    //and the string "I give up" when x is null
    val x: String? = "I AM İN UPPERCASE"
    var anotherString=x ?: "I give up "
    println(anotherString.lowercase())//I DID IT! litle bit different

    //use let function and print x lovercase and change "am" as "am not"
    x?.let { println(it.lowercase().replace("am","am not") )}
    //Change this code and say to compiler mt variable cant be null

    val myNonNullVar:Int? = null
    myNonNullVar!!.toDouble()

}