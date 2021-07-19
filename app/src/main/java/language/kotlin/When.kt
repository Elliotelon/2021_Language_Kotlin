package language.kotlin

fun main(){

    val a1 = 2
    when(a1){
        1 -> println("a1은 1")
        2 -> println("a1은 2")
        3 -> println("a1은 2")
        else -> println("a1은 1,2,3이 아닙니다.")
    }

    val a2 = 3
    when(a2){
        1,2 -> println("a2는 1 또는 2")
        3,4 -> println("a2는 3 또는 4")
    }

    val a3 = 55.55
    when(a3){

        33.33 -> println("a3은 33.33")
        44.44 -> println("a3은 44.44")
        55.55 -> println("a3은 55.55")
    }

    val a4 = "문자열2"
    when(a4){
        "문자열1" -> println("첫번째 문자열")
        "문자열2" -> println("두번째 문자열")
    }

    val a5 = 5
    when(a5){
        in 1..3 -> println("a5는 1~3")
        in 3..5 -> println("a5는 3~5")
        in 5..7 -> println("a5는 5~7")

    }

    val str1 = setValue(1)
    val str2 = setValue(2)
    val str3 = setValue(3)
    println(str1)
    println(str2)
    println(str3)
}

fun setValue(a1 : Int) = when(a1){
    1 -> "문자열1"
    2 -> "문자열2"
    else -> "문자열1,2가 아닙니다."
}

