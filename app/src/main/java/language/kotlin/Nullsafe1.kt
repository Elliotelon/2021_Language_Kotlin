package language.kotlin

fun main() {

    testFun1("문자열")
//    testFun1(null)

    println("------------------")
    testFun2("문자열2")
    testFun2(null)

    println("------------------")
    testFun3("문자열3")
    testFun3(null)
}
// !! - null을 허용하지 않는 형태로 변환한다.
fun testFun1(str:String?){
    val value1:String = str!!
    println("value1 : $value1")
}

// ?: - null이라면 지정된 기본값이 반환한다.
fun testFun2(str:String?){
    val value2:String = str ?: "기본문자열"
    println("value2 : $value2")
}

// .? - 메소드 호출시 null 이라면 메소드가 호출되지 않고 null을 반환한다.
fun testFun3(str:String?){
    println("str : $str")
    println("str length : ${str?.length}")
}