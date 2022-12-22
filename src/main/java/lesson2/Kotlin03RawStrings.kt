package lesson2

class Kotlin03RawStrings {

}
fun main() {
    /*
    If we want to escape characters like \s \w \d in our String
    we can create valid String like this """ String """

     */
    val filePath="""c:\\some\\w\\n asdf"""
    val oglus="Furkir"
    val nextLineString="""fatih
                                *yaşar 
                                *gözde
                                *$oglus
    """.trimMargin("*")//trimMargin() lets us delete spacesbefore  where we use parameter
    // Kotlin understands our line between three "s
    println(nextLineString)
}