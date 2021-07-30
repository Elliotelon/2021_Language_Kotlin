package language.kotlin

fun main() {
    printDirection(Direction.EAST)
    printDirection(Direction.NORTH)

    val dir : Direction = Direction.WEST
    println(dir)

    println("------------------------------------")

    printNum(Num.TWO)


}

//val north = 1
//val south = 2
//val west = 3
//val east = 4

enum class Direction{
    NORTH, SOUTH, WEST, EAST
}

enum class Num(val num : Int, val str : String){
    ONE(1, "하나"), TWO(2, "둘"), THREE(3, "셋")
}

fun printDirection(a1 : Direction){
    when(a1){
        Direction.NORTH -> println("북쪽")
        Direction.SOUTH -> println("남쪽")
        Direction.EAST -> println("동쪽")
        Direction.WEST -> println("서쪽")

    }
}

fun printNum(a1 : Num){
    when(a1){
        Num.ONE -> println("1")
        Num.TWO -> println("2")
        Num.THREE -> println("3")
    }

    when(a1.num){
        1-> println("1")
        2 -> println("2")
        3 -> println("3")
    }

    when(a1.str){
        "하나"-> println("1")
        "둘" -> println("2")
        "셋"-> println("3")
    }

    println("a1.num : ${a1.num}")
    println("a1.str : ${a1.str}")
}
