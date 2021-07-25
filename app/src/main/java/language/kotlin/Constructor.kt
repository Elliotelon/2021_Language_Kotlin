package language.kotlin

fun main() {
    val obj1 = AClass1()
    println("obj1 : $obj1")

    println("-----------------------")

    val obj2 = AClass2()
    println("obj2 : $obj2")
    println("obj2.v1 : ${obj2.v1}")
    println("obj2.v2 : ${obj2.v2}")

    println("-----------------------")

    val obj3 = AClass2(100, 200)
    println("obj3 : $obj3")
    println("obj3.v1 : ${obj3.v1}")
    println("obj3.v2 : ${obj3.v2}")

    println("-----------------------")
    val obj4 = AClass3(100, 200)
    val obj5 = AClass4(1000, 2000)

    println("obj4.a1 : ${obj4.a1}")
    println("obj4.a2 : ${obj4.a2}")

    println("obj5.a1 : ${obj5.a1}")
    println("obj5.a2 : ${obj5.a2}")

    println("-----------------------")

    val obj6 = AClass5(100, 200)
    println("obj6.a1 : ${obj6.a1}")
    println("obj6.a2 : ${obj6.a2}")

    println("-----------------------")

    val obj7 = AClass5(100)

}

class AClass1{

    init {
        println("객체 생성되면 자동으로 동작되는 부분")
    }

}

class AClass2{
    var v1:Int = 0
    var v2:Int = 0

    constructor(){
        println("매개변수가 없는 생성자")
    }

    constructor(a1: Int, a2:Int){
        println("매개변수가 두개인 생성자")
        v1 = a1
        v2 = a2
    }
}

class AClass3 constructor (var a1:Int, val a2:Int)
class AClass4 (var a1:Int, val a2:Int)

class AClass5 (var a1:Int, val a2:Int){

    init {
        println("init 코드 수행")
        println("a1 : $a1")
        println("a2 : $a2")
    }

    constructor(a1:Int) : this(a1, 100){
        println("보조 생성자 호출")
    }
}