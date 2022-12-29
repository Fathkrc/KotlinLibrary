package Challenges

import java.util.*

class Challenge1 {
    /* Declare two immutable String variables called hello1 and hello2.
   Assign "Hello" to both variables
    */
}
fun main() {
    val hello1="Hello"
    val hello2="Hello"
    var b=hello1.equals(hello2)//variable also being created default as boolean
    println(b)
    println("hello1 is referentially equal to hello2: ${hello1===hello2}")
    //"===" compare variables  referentially
    //Strings are immutable and two variables uses same instance of "Hello" through String pool

    println("hello1 is Structural equal to hello2: ${hello1==hello2}")
    //"==" compare variables  Structurally
    //Declare a mutable variable of type Int and assign it the value of 2988
    var x=2988
    //Declare a immutable variable of type Any type and assign it the string "The Any type
    //is root of the Kotlin class hierarchy" .Then using a smart cast, print out
    //uppercased string
    val text:Any="The Any type is the root of the Kotlin class hierarchy"
    if (text is String) {
        println(text.uppercase(Locale.getDefault()))
    }
    //Using one line of code print out the folllowing make sure your code is intended(amaçlanan)
    println("   1\n  11\n 111\n1111")
    println("""   1
        |   11
        |   111
        |   1111
    """.trimMargin("1"))//trimMargin detected first 1 as parameter and deleted

}
