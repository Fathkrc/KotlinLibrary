package lesson3

fun main() {
    val str:String?=null
    //printText(str!!)//When str is null when we call a method with parameter as str compiler throws Exception
   // val str2=str!!
   // val str3=str2.uppercase()
   // println(str3)
  //  str!!.uppercase()//If we want to throw an exception in case of string is null,
    //WE use "!!" operator after String
    /* using "!!" is same as this code;
    if(str==null)throw exception
    else str.uppercase()
    val countryCode=bankBranch!!.adress!!.country!! in this code we can not know where exception is throwing
    so this is not a good recommended use
     */
/*
    if (str!=null) {           *****Short handling with "let function"
        printText(str)          str?.let{ printText(str)} ==> Lambda expression I don't know how, but it is lol
    }
*/

    str?.let{ printText(it)}  // it is a if it's null don't act but its not null implement the function
    val str4:String?=null
    val anotherString ="This is not nullable"
    println(str4==anotherString)//REMINDER!! "==" checks structural equality in Kotlin unlike JAVA "irrelative btw"
    //println(str4==anotherString) means if str4 is null print anotherString as default
    // Operation does null check undercover , and  we don't see exception in this situation
    // Kotlin makes this function SAFE itself
    var b:Boolean? =null // I just tried smt here


}
fun printText(text: String){
    println(text)
}