package language.kotlin

fun main() {
    test1()

    test2(100, 11.11)
    test2(a2 = 66.66, a1 = 600)

    test3(100, 11.11)
    test3(200)
    test3(a2 = 33.33)

    val r1:Int = test4(100, 200)
    val r2:Int = test4(1000, 2000)
    println("r1 : $r1")
    println("r2 : $r2")

    test5()

    test6()

    test7()
    test7(100)
    test7(11.11)
    test7(100, 200)

    test8()
}

fun test1() {
    println("test1 호출")
    println("------------------")
}

fun test2(a1: Int, a2: Double) {
    println("test2 호출")
    println("a1 : $a1")
    println("a2 : $a2")
    println("-------------------")
}

fun test3(a1: Int = 0, a2: Double = 0.0) {
    println("test3 호출")
    println("a1 : $a1")
    println("a2 : $a2")
    println("-------------------")

}

fun test4(a1: Int, a2 : Int) : Int {
    val result : Int = a1 + a2
    return result
}

fun test5() : Unit {
    println("test5 호출")
    println("-------------------")

}

fun test6() {
    println("test6 호출")
    println("-------------------")

}

fun test7() {
    println("test7호출 - 매개변수 없음")
    println("-------------------")

}

fun test7(a1: Int) {
    println("test7호출 - 매개변수 한개(Int)")
    println("-------------------")
}

fun test7(a1: Double) {
    println("test7호출 - 매개변수 한개(Double)")
    println("-------------------")
}

fun test7(a1: Int, a2: Int) {
    println("test7호출 - 매개변수 두개")
    println("-------------------")
}

fun test8() {
    println("test8 호출")

    fun test9() {
        println("test9 호출")
    }

    test9()
}