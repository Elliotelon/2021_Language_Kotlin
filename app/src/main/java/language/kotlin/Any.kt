package language.kotlin

fun main() {
    val obj1 = BClass1()
    println("obj1 : $obj1")

    val obj2 = BClass2()
    val obj3 = BClass3()

    bFun1(obj1)
    bFun1(obj2)
    bFun1(obj3)
}

class BClass1{

    override fun toString(): String {
        return "BClass1의 객체"
    }

}

class BClass2{

    override fun toString(): String {
        return "BClass2의 객체"
    }

}

class BClass3{

    override fun toString(): String {
        return "BClass3의 객체"
    }

}

fun bFun1(a1 : Any){
    println("a1 : $a1")
}