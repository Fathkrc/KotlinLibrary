package lesson2

class Kotlin01BitOperatorsSmartCast {
    /*
    Kotlin does not have "|"  and  "&" operators instead it is using
                         "or" and "and"
    Kotlin does not have "instanceOf" method instead of it is using
                            "is"  keyword
     */
}

fun main() {
    val x = 0x00101101
    val y = 0x11011011
    val employee1 = Employee("Mary", 1)
    val employee2= Employee("John",2)
    var sth: Any = employee1 //Any is like Object in Java but not the same
    if (sth is Employee) {// if (sth !is Employee) is not *
       // val newEmployee=sth as Employee //In Kotlyn we don't have to do cast the object Kotlin does smart casting as default
        //If we try this ; Still can do casting as Employee
        // sth=employee2
        println(sth.name)
       /* We need this structure to reach fields in Java
       Employee obj=new Employee("Mary",1);
                Object sth=obj;
        System.out.println(((kotlin01) obj2).age);
        If we don't make  Cast expression we can't reach fields in Java
        */

    }

}