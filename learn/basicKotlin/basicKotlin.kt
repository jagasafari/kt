class Game {
    var Question = "what?"
    var Answer:String? = null
    val AnsNullable:String?=null
}
fun main(args: Array<String>){
    var game:Game? = Game()
    game?.Answer = null
    var message:String
    if(game?.Answer == "42"){
        message = "ok"}
    else{
        message="wrong answer"}
    println(message)
    val msg = if(game?.Answer == "42") "ok" else "wrong answer"
    println(msg)
    if(game?.AnsNullable != null){
        println("not null")
    }
    println("${parseInt()}")
    downToByStep()
}
private fun downToByStep(){
    for( i in 99 downTo -9 step 30)
    {
        println(i)
    }
}
private fun parseInt() =
    try{
        "5".toInt()
    }
    catch(e: NumberFormatException){
        8}


