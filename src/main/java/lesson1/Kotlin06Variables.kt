package lesson1

class Kotlin06Variables {

}
fun main() {
    /*There are two different keywords to create variables or declarations;
    1. one is val : it is using for immutable declarations like Final in Java
    2. one is var : it is mutable declarations to describe our variable assignment can be changed (xcode*)
     */
    val number =25//First way is assignment kotlin assuming this variable Integer as default
    val number1:Int // Second way , we define our variable like this
    //First wat is more often being used
    number1=23
    //number1=20 giving error because variable is defined as val*
    var number2=12;
    number2=3000 //no error
    val employee1=Employee("Fatih",200)
    val employee2=Employee("Yasar",400)
    employee1.name="fassak"//we could change the name variable because it was "var"
    //employee2.id=1234 but we did not able to change id variable it is "val"
    val employee3:Employee // we did not assignment with "=" but we created an employee3
    if (employee2.id>number2) {
        employee3=Employee("Haluk",150)
    }else{//Even our employee3 is val(immutable) we can create this structure because only one assignment will be implemented
        employee3 = Employee("Seyma",700)
    }
   // number2="sadfsdfsdf" We can't do this obviously ..



}
class Employee(var name:String,val id:Int ){
    //this structure already have constructor , getters and setters.
    override fun toString(): String {//toString method is not being override default
        return "Employee(name='$name', id=$id)"
    }
}