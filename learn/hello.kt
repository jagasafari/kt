class Person {
    var Name:String = ""
}

class PersonWithConstructor(var Name:String) {
    fun display(){
        println("Name is $Name")
    }
    fun higherOrdFunc(func: (name: String) -> Unit){
        func(Name)
    }
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
    val p3 = PersonWithConstructor("name from constructor")
    println("person with constructor: ${p3.Name}")
    p3.display()
}
