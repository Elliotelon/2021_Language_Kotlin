package language.kotlin

fun main() {

    // 한줄 주석

    /*
        여러줄
        주석
     */

    // print: 값을 출력하고 밑으로 내리지 않는다
    print("문자열 입니다.")
    print("문자열 입니다.")
    print("문자열 입니다.")

    // println: 값을 출력하고 밑으로 내린다.
    println("문자열 입니다.")
    println("문자열 입니다.")
    println("문자열 입니다.")

    // 값을 출력할 때는 ${값}을 사용한다.
    println("값 : " + 100)
    println("값 : ${100}")

    // 세미콜론(;)은 선택사항이다.
    // 한 줄에 여러 명령문을 작성할때는 세미콜론(;)을 붙혀줘야 한다.
    println("세미콜론 없음")
    println("세미콜론 있음");

    println("명령문1"); println("명령문2"); println("명령문3")

}