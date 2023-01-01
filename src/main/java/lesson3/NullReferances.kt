package lesson3

import java.util.*

class NullReferances {
}

fun main() {
    //  var str:String=null | in Kotlin "null" can not value for "not-null" String
    var str: String? = null
    // String? is a nullable
    //We can't reach String methods like(toUpperCase() ect) in this case
    // Kotlin doesn't let us because it's nullable Variable
    str?.uppercase()//Not working on my Kotlin as it should I guess there are some updates about this
    println("What happens when we do this : ${str?.uppercase()}")
    // toUpperCase() method is depricated !!!

    //val countryCode:String =bankBranch?.adress?.country?.countryCode
    //it is a nested if situation on one line if there is a null our variable is null
    //Without exceptions

    //ELVIS OPERATOR==> ?:
    //It lets you assign a default value when an expression valuates to null
    val str2=str?: "This is a default value"//compiler does not complain because default value is every case String even str is null
    println(str2)// output is This is a default value if str is null

    val something :Any= arrayOf(1,2,3,4,5)

    val str3=something as? String//we are Handling and value can be null
    println(str3)
    str3?.uppercase()//we handled exception again adn result is null
    println(str3)



}