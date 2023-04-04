package lesson04Section5


/*
Kotlin does not have fields kotlin have properties!!!that is not all correct but i will come back here later
if we do properties private we can not access them
Setter and getters comes default but not like java'
we call properties from the object and we can assign new values
 */
class Kotlin03Properties (var name:String){
//
//    get(){
//        println("get is working ")
//        return field
//    }
}

fun main() {
    var obj=Kotlin03Properties("asd")
    println(obj.name)// its getter
    obj.name="fatih"// Its setter way
    println(obj.name)
}