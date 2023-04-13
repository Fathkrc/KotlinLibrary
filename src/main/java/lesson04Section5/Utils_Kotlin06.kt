package lesson04Section5

class Utils_Kotlin06 {

    fun upperFirstAndLast(str:String):String{
        val upperString=str.substring(0,1).uppercase()+str.substring(1)
        return upperString.substring(0,upperString.length-1)+
                upperString.substring(upperString.length-1).uppercase()
    }
}