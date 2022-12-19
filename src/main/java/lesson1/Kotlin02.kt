package lesson1
//I just copied everything from Kotlin01 Java class and pasted into Kotlin02 kotlin file and
//Java asked me to convert Java codes into Kotlin format I accepted .
//My course has published at 2018 so something have changed in Kotlin construction

class Kotlin02 (val name: String,val age: Int){//don't need const. or getter-setter
    override fun toString(): String {
       return  name + age;
    }//toString is same if we don't override result will be like "lesson1.Kotlin02@3a71f4dd"

}
fun main() {
    val person1=Kotlin02("Fatih",30);
    println(person1)
    println(person1.name)
}