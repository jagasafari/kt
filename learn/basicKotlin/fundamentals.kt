import java.math.BigInteger

fun main(args: Array<String>){
    extenstionFunctionAndRegex()
    infixFunctionAndOperatorOverloading()
    tailRec()
    algebraicDataType()
    singleton()
    companionObject()
}
fun companionObject(){
   MyTimer.staticFun() 
}
fun singleton(){
    println(CacheSingleton.a.size)
    val filtered = CacheSingleton.a.filter{it>8}.firstOrNull()
    println(filtered == null)
}
object CacheSingleton {
    var a = arrayListOf<Int>()
}
fun algebraicDataType(){
    val me: MyEvent = MyEvent.Send()
    when(me){
        is MyEvent.Send -> println("send event")
        is MyEvent.Recieve -> println("recieve event")
    }
}
sealed class MyEvent {
    class Recieve : MyEvent()
    class Send : MyEvent()
}

data class MyTime(val h: Int, val m: Int = 0, val s: Int = 0)
interface Timer {
    fun setTime(h: Int, m: Int = 0, s: Int = 0)
    fun setMyTime(t: MyTime) = setTime(t.h)
}
interface SameContractInterface {
    fun setMyTime(t: MyTime) {}
}
    
class MyTimer : Timer, SameContractInterface  {
    override fun setTime(h: Int, m: Int, s: Int){}
    override fun setMyTime(t: MyTime): Unit { 
        super<SameContractInterface>.setMyTime(t)
    }

    companion object {
        fun staticFun(){
            println("calling static function")}
        fun secondStaticFun(){
            println("calling second static function")}
    }
}
fun fib(value: Int): BigInteger {
    tailrec fun fibRec(next: Int, a: BigInteger, b: BigInteger): BigInteger =
        if (next == 0) b else fibRec(next - 1, a + b, a)
    return fibRec(value, BigInteger("1"), BigInteger("0"))
}        
fun tailRec(){
    println("fib of 56 is ${fib(56)}")
}
fun extenstionFunctionAndRegex(){
    regexOnSpaces("a   // \t ko'")
    "a   // \t ko'".regexOnSpacesExtension()
}
data class Head(val value: Int){}
operator infix fun Head.plus(head: Head) = this.value + head.value
private fun infixFunctionAndOperatorOverloading(){
    println(Head(7).plus(Head(7)))
    println(Head(4) plus Head(6))
    println(Head(8) + Head(0))
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
