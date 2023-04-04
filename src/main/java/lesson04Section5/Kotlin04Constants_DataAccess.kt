package lesson04Section5

class Kotlin04Constants_DataAccess {
}
/*
data classes comes with two string function
equals hashcode and equals functions
It provides us creating our pojo classes as data makes our code so basic
data classes properties or fields must be declared as val or val
data classes can not be abstract sealed?? or inner classes
data classes have tostring method also but if we want to change we can override it
 */
data class Car(val color:String, val model: String, val year:Int){


}

fun main() {
    val car=Car("red","BMW",2020)
    val car2=Car("red","BMW",2020)

    println(car==car2)// hashcode and equals methods come default so this is true
    val normalObj=NormalClass("obj1")
    val normalObj2=NormalClass("obj1")
    println("--------------")
    println(normalObj==normalObj2)// normal class does not have equals and hash code implementation so false
    println(car)//toString comes default from data class
    println(normalObj)//toString does not come default from a normal class
    println("--------------")
    //we have also a copy method overriden in data classes
    val car3=car2.copy(year=2022)
    // we can use copy method and we can change any paramether we want and others can stay same
    // thats amazing!!!!
    println(car3)
    println("--------------")
    val car4=car2.copy(color="grenn",year=2022)//that's also possible
    println(car4)



}
class NormalClass(val name:String)