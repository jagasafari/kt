class Person {
    var Name:String = ""
}

fun main(args: Array<String>){
    println("hallo world") 
    var mutableInstance = Person()
    println("mutable Person instance: ${mutableInstance}")
    mutableInstance = Person()
    mutableInstance.Name = "next name"
    println("mutable Person instance mutated: ${mutableInstance}")
    val immutableInstance = Person()
    println("imutable instance: ${immutableInstance}")
    immutableInstance.Name = "assign name"
    println("imutable instance name var value: ${immutableInstance.Name}")
}
