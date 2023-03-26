package lesson04Section5;
/*
Kotlin has different access modifier system
Top level items are different from java
In java
 - java class default access modifier is package private
 - java class can't be declared as private
in Kotlin
 -default visibility is Public
 -kotlin class can be declared as private and can be access by from the same file that class in

in Kotlin there are four visibility modifiers :
                    java ||| kotlin
private->   Can't be use ||| visible within the same file
public ->           Visible everywhere
protected ->        Can't be used
internal-> not exist     ||| Visible within the same module

if we use kotlin java mixed program when we try to access any one of kotlin classes and if it gives us different
hash names that class can be internal class and we should check if we should access that class
 */


public class Kotlin01 {

}
fun main() {
val emp=Employee()
// Employee class is private even then we can access and create an object from this class


}

private class Employee {}
