package chap02.section2

fun main( )
{
    val num = 10
    val formattedString = """
        var a = 6
        var b = "Kotlin"
        println(a + num)
        """
    println(formattedString) // """로 감싼 문자열에 있는 모든 내용 출력
}