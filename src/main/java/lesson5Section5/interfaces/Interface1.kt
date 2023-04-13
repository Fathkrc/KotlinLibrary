package lesson5Section5.interfaces

interface Interface1 {
    fun myFunc(str:String):String
}
interface subInterface:Interface1{
    val myInt:Int
    fun mySubFunc(num:Int):String
}
class normalClass:subInterface{
    override val myInt: Int=23// we inherited int and asssignment has to be done like that
    //or get()=121 like this

    override fun mySubFunc(num: Int): String {
        TODO("Not yet implemented")
    }

    override fun myFunc(str: String): String {
        return "hello"
    }

}