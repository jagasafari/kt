fun main(args:Array<String>){
    deconstructClass()
    dataClass()
    deconstructingMap()
    comperingDataClass()
}

fun comperingDataClass() {
    val a = MyDataClass(0, "a")
    val b = MyDataClass(0, "a")
    println("data class a == data class b, ${a==b}")
    val c = MyDataClass(8, "c")
    println("data class b == data class c, ${b==c}")
}

fun deconstructingMap() {
    val mymap = HashMap<String, Int>()
    mymap.put("a", 0)
    mymap.put("b", 1)
    mymap.forEach { (key, value) -> println("$key and $value") }
    for ((key, value) in mymap)
    {
        println("$key and $value")
    }
}

fun dataClass() {
    val dataClassInstance = MyDataClass(9, "sfs")
    println(dataClassInstance.num)
    println(dataClassInstance.str)
    val (num, str) = MyDataClass(89, "dfs")
    println("$num and $str")
    println("${dataClassInstance.component1()} and ${dataClassInstance.component2()}")
}

data class MyDataClass(val num: Int, val str: String)

fun deconstructClass() {
    val notDeconstructed = MyPair(0, "abc")
    println("${notDeconstructed.value1}")
    val (value1, value2) = MyPair(8, "abn")
    println("$value1 and $value2")
}

class MyPair<K, T>(val value1: K, val value2: T) {

    operator fun component1(): K = value1

    operator fun component2(): T = value2

}
