package language.kotlin

fun main() {
    val s1 = SubClass1()
    println("s1.subMember1 : ${s1.subMember1}")
    s1.subMethod1()

    println("s1.superMember1 : ${s1.superMember1}")
    s1.superMethod1()
}

open class SuperClass1{
    var superMember1 = 100

    fun superMethod1(){
        println("SuperClass1의 메소드 입니다.")
    }
}

class SubClass1 : SuperClass1(){
    val subMember1 = 200

    fun subMethod1(){
        println("SubClass1의 메소드 입니다.")
    }
}

open class SuperClass2(val a1:Int){

    class SubClass2 : SuperClass2(100)

    class SubClass3 : SuperClass2{

        constructor() :super(100)
    }
}