package lesson04Section5

class Kotlin05ReturnTypes2 {
}

fun main() {
    val car1=Car2("red","toyota",2000)
    val car2=Car2("blue","toyota",3000)
    val car3=Car2("black","toyota",2000)
    printColors(car1,car2,car3)
    // we can also can use asterix "*" for arrays to pick their elements
    // in java for example varargs integer methods can accept int arrays but in kotlin
    // we have to use asterix like this varargsMethodcall(*ourArray)
}
fun printColors(vararg cars:Car2){
    for(car in cars){
        println(car.color)
    }
}

data class Car2(val color:String,val model:String,val year:Int){

}