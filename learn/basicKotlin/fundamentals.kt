fun main(args: Array<String>){
    extenstionFunctionAndRegex()
    infixFunctionAndOperatorOverloading()
}
private fun extenstionFunctionAndRegex(){
    regexOnSpaces("a   // \t ko'")
    "a   // \t ko'".regexOnSpacesExtension()
}
data class Head(val value: Int){}
operator infix fun Head.plus(head: Head) = this.value + head.value
private fun infixFunctionAndOperatorOverloading(){
    println(Head(7).plus(Head(7)))
    println(Head(4) plus Head(6))
}
fun regexOnSpaces(str: String)
{
    var rx=Regex("\\s+")
    println(rx.replace(str, " "))
}
fun String.regexOnSpacesExtension(){
    var rx=Regex("\\s+")
    println(rx.replace(this, " "))
}
