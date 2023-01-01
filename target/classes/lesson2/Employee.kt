package lesson2

import lesson1.EmployeeSet

class Employee(var name:String,var id:Int) {
    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name==obj.name&&id==obj.id
        }
        return false }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}

fun main() {
    val employee1=Employee("Mary",1)
    val employee2=Employee("John",2)
    val employee3=Employee("John",2)
    println(employee1==employee2)
    println(employee2==employee3)//In Kotlin "==" operator is doing structural comparing
    println(employee1.equals(employee2))
    println(employee2.equals(employee3))
    //"==="operator does the  "==" operators return from java
    //"===" operator does Referentially compare
    println(employee1===employee2)
    println(employee2===employee3)
    val employee4=employee2
    println(employee4===employee4)//this returns true because their references are same
    println(employee4!=employee2)
    println(employee4!=employee3)
    println(employee2!==employee3)




}