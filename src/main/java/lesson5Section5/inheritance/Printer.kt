package lesson5Section5.inheritance

abstract class Printer(val modelName:String) {
   open fun printModel()= println("The model is $modelName")
    abstract fun bestSellingPrice():Double
}
open class LaserPrinter(modelName: String):Printer(modelName){
    override fun printModel()= println("The Laser Printer model is $modelName")
    override fun bestSellingPrice(): Double=12.222
    //override keyword must exist

}
class SpecialLaserPrinter(modelName: String) :LaserPrinter(modelName){
    override fun printModel()= println("this is subsubclass ")
}

fun main() {
   val  lp = LaserPrinter("Laser Printer")
    lp.printModel()
    println(lp.bestSellingPrice())
}