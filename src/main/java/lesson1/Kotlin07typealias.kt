package lesson1

import java.lang.StringBuilder

typealias EmployeeSet=Set<Employee>
/*
"typealiases" provide alternative names for existing types. like it's so short
If the type name is too long you can introduce a different shorter name and use the new one instead.
For example Stringbuilder , Kotlin takes StringBuilder from java.lang Library . we can use it with typealiases
And also we can create things outside the classes or functions!! things xD
 */
fun main() {
    val employee1=Employee("Fatih",200)
    val employee2=Employee("Yasar",400)
    var employees:EmployeeSet= setOf(employee1,employee2)// It is describing employees data type as EmployeeSet
    // There is a simple setOf() method but no add()
    println(employees)
    //var str:StringBuilder
    "Fatih".indexOf('i')//without assignment, ok...



}