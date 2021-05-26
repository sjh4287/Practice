package chap02.section4

fun main( )
{
    var number1 = 12
    var number2 = 25

    number1 = number1 xor number2
    number2 = number1 xor number2
    number1 = number1 xor number2 // xor 3번 이용하는 스왑기법으로 임시변수 없이 두 수 값을 변경

    println("number1 = " + number1)
    println("number2 = " + number2)
}