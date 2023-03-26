package lesson04Section5


// classes are default public and final in Kotlin !!!
class Kotlin02DeclaringClassesAndConstructor {





}

fun main() {
    val emp=Employee2("furkir")
    println(emp.firstName)
    val emp2=Employee3("fatih", false)
    println("Employee "+ emp2.firstName+" is "+ emp2.fullTime )
    println(Demo().hello)
}

class Employee2 constructor(val firstName:String ){//short way
//    val firstName:String
//                                  !!!  LONG WAY
//    init{
//        this.firstName=firstName
//    }

}
class Employee3 constructor(val firstName:String , val fullTime:Boolean){//short way
// same way and two paramether

}
class Demo {
    val hello:String
    constructor(){
        hello="Hello"
    }
}