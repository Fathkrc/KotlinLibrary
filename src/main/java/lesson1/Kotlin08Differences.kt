package lesson1

class Kotlin08Differences {
    /*
    -Semicolons : it's not necessary to use it in kotlin but does not give error if we use
    -Wrappers: Just like println() example in kotlin we don't use some parts that we use in Java
    -Java has keywords that they are usable whenever we need but in kotlin we have soft keywords and
    hard keywords ara just like Java
    "var number:Int OR var number=12"example for hard kw: "var" part for sf kw:Int
    -We use different methods to create something like this  example in main
    -Exceptions: All exception classes in Kotlin inherit the Throwable class.
    Every exception has a message, a stack trace, and an optional cause.
    There may be zero or more catch blocks, and the finally block may be comitted.
    There is no "throws ...." option in kotlin
    -Ternary operator is not exist in Kotlin
    -Basic For Loop does not exist in Kotlin : for(int i=0;i<10;i++)-> no it doesn't :'|
    -Static keyword does not exist syntactically in Kotlin but "static consept" is still in progress
    -There is no NEW keyword
    These differences are just for now...
     */

}

fun main() {
    //We can create Arraylist like this; I typed just "val name=arrayListOf(String values inside )"
    //kotlin detected what I gave it as variables
    val name= arrayListOf("Fatih","Yasar","Seyma")
    println(name[2])//that's usable
    //Kotlin has its own STRİNG CLASS!! There are some methods with different usage from java in kotlin String class
    //kotlin String class have also some methods that java String class don't have or have with different returns



}