package lesson04Section5

class Kotlin05ReturnTypes {
}
/*
default return type is unit in kotlin !!!!

 */

fun main() {
    println(labelMultiply(4, 5,"Result 1 is :"))
    println(labelMultiply2(x=5,y=6,str="Result 2 is : "))
    // we can also assign values with keys like that

    println(labelMultiply3(5,6))
    println("-------------------------")
    val stud=Student("joe")
    println(stud.toUppercase())
    // we called func from class and our name parameter becomes uppercase
}
//1. way BLOCK BODY
fun labelMultiply(x:Int,y:Int,str:String):String{// we are declaring return type at the and with : operator
    return "$str ${x*y}"
}// block body
// 2. Way EXPRESSIONS BODY
fun labelMultiply2 (x:Int,y:Int,str:String): String="$str ${x*y}"

// 3. Way EXPRESSION BODY
fun labelMultiply3(x:Int,y:Int,str:String="this is default String ")="$str ${x*y}"
// we did give a default value to str value and called method without any string
// it worked with our default string
// if we want to give a default value in function paramether we have to describe values data type

class Student(val name: String){
    fun toUppercase()=name.uppercase()// we can use parameter directly
}