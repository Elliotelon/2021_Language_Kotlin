package language.kotlin

fun main() {
    val v1 = Number.TWO

    checkNumber(v1)

    val v2 = Number2.SealedTwo(1)
    val v3 = Number2.SealedTwo(2)

    checkNumber2(v2)
    checkNumber2(v3)
}

enum class Number(val num : Int){
    ONE(1), TWO(2), THREE(3)
}

fun checkNumber(a1 : Number){

    when(a1){
        Number.ONE -> println("1 입니다.")
        Number.TWO -> println("2 입니다.")
        Number.THREE -> println("3 입니다.")
    }

    when(a1.num){
        1 -> println("1 입니다.")
        2 -> println("2 입니다.")
        3 -> println("3 입니다.")
    }
}

sealed class Number2{

    class SealedOne(val a1 : Int) : Number2()
    class SealedTwo(val a1 : Int) : Number2(){
        fun sealedFun2(){
            println("SealedTwo의 sealedFun2 입니다.")
        }
    }
    class SealedThree(val a1 : Int) : Number2()
}

fun checkNumber2(obj : Number2){
    when(obj){
        is Number2.SealedOne -> {
            println("One 입니다.")
            println(obj.a1)
        }
        is Number2.SealedTwo -> {
            println("Two 입니다.")
            println(obj.a1)
            when(obj.a1){
                1 -> println("1입니다.")
                2 -> println("2입니다.")
            }
            obj.sealedFun2()

        }
        is Number2.SealedThree -> {
            println("Three 입니다.")
            println(obj.a1)

        }
    }
}