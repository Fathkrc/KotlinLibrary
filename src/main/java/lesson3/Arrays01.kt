package lesson3

class Arrays01 {
}

fun main() {
    val name= arrayOf("John","Jane","Jill")

    val longs1= arrayOf(1L,2L,3L)
    val longs2=arrayOf<Long>(1,2,3,4)
    val longs3= arrayOf(1,2,3,4)
    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)
    println(longs1[1])

    val evenNumbers=Array(16){i->i*2}

    for(number in evenNumbers){
        print(number.toString().plus(" "))
    }

    val lotsOfNumber=Array(10000){i->i+1}
    //lotsOfNumber.forEach { t-> print(t.toString().plus(" ")) }
    val allZeros =Array(100){0}
println()
    var someArray:Array<Int>
    someArray= arrayOf(1,2,3,4)
    for(number in someArray){
        println(number)
    }
    someArray=Array(6){i->(i+1)*10}
    for(number in someArray){
        println(number)
    }
}