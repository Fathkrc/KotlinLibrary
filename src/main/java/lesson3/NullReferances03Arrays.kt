package lesson3

class NullReferances03Arrays {
}

fun main() {
    val nullableInts= arrayOfNulls<Int?>(5)
    for (i in nullableInts) {
        println(i)
    }

    println(nullableInts[3].toString())
    /*
    We have a nullable Int array and all values are null.
    If we try to call our Array methods with as example: " nullableInts[3]." , We see Kotlin does not let us
     use lots of methods but toString() method can be called this method has "Any?" structure inside it
     , it prints it as "null"
     */
}