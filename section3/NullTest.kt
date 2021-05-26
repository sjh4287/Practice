package chap02.section3

fun main( )
{
    var str1 : String? = "Hello Kotlin" //null을 허용햐기 위해 자료형뒤에 ?기호 명시
    str1 = null

    val len = if(str1 != null) str1.length else -1 //조건식을 통해 null 상태 검사
    println("str1: $str1 length: ${len}")
}