fun main(args:Array<String>) {
    accessingArray(args = args)
    forLoop(args = args)
    args.patternMatching()
    args.nullCheckAndTryCatch()
    typeCheckingAndNoCastForVal(value = "aaa")
    typeCheckingAndNoCastForValShorter(value = "aaa")
    8.inRange(from = 6, to = 99)
    11.arrayListNotInRange()
    "abc".cases()
}

fun Any.cases() = when (this) {
    1 -> println("integer")
    "abc" -> println("string abc")
    this is String -> println("some other s")
    this !is Int -> println("not int")
    else -> Unit
}

fun Int.arrayListNotInRange() {
    val arrList = arrayListOf<String>()
    arrList.add("A")
    if(this !in 0..arrList.size - 1) {
        println("out of range")
    }
}

fun Int.inRange(from: Int, to: Int) =
        if(this in from..to - 1) println("in range") else println("not in range")

fun typeCheckingAndNoCastForValShorter(value: Any): Int? = (value as? String)?.length

fun typeCheckingAndNoCastForVal(value: Any): Int? = if(value is String) value.length else null

private fun Array<String>.nullCheckAndTryCatch()
{
    if(size == 2)
    {
        val a = parseInt(this[0])
        val b = parseInt(this[1])
        if(a!=null && b!=null)
        {
            println("sum : ${a+b}")
        }
    }
}
private fun parseInt(value: String):Int?
{
    try {
         return value.toInt()
    }
    catch (e: NumberFormatException)
    {
        return null
    }
}
private fun Array<String>.patternMatching() {
    val language = if (size == 0) "EN" else this[0]
    println(when (language) {
        "EN" -> "hallo"
        "FR" -> "salut"
        else -> "language not known"
    })
}

private fun forLoop(args: Array<String>) {
    for (arg in args) {
        println(arg)
    }
}

private fun accessingArray(args: Array<String>) = when {
    args.size == 0 -> println("no arguments")
    else -> println("argument: ${args[0]}")
}