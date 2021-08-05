package language.kotlin

import java.lang.ArithmeticException
import java.lang.Exception

fun main() {
    try {
        //val a1 = 10/0
//        val str:String? = null
//        println(str!!.length)

        val str2 = "안녕하세요"
        val a2:Int = str2.toInt()
        println("a2 : $a2")
    }catch (e: ArithmeticException){
        println("수학적오류 발생시 출력")
    }catch (e: KotlinNullPointerException){
        println("Null 오류 발생")
    }catch (e : Exception){
        println("예외 발생")
        e.printStackTrace()
    }
}