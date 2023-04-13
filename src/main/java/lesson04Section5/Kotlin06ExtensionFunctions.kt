package lesson04Section5

class Kotlin06ExtensionFunctions {
}

fun main() {
    println(Utils_Kotlin06().upperFirstAndLast("this is all lowercase"))
    // we can use a method by calling it from this class but
    val s="this is all lowercase"
    println(s.upperFirstAndLast())
    // we can use a method and make an illusion like this method acts like it belongs to String class
    // So we can call this method with any string like its string classes own method
}
// if we do this way
fun String.upperFirstAndLast():String{
    val upperString=this.substring(0,1).uppercase()+this.substring(1)
    return upperString.substring(0,upperString.length-1)+
            upperString.substring(upperString.length-1).uppercase()
}