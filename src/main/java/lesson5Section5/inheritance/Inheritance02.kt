package lesson5Section5.inheritance

class Inheritance02 {
}
open class Class1(val x:Int){
    val someString: String="aaa"

    constructor(parameter1: String,x:Int):this(x)

}
class Class2:Class1{
    constructor(parameter2: String,z:Int):super(parameter2,z)
}