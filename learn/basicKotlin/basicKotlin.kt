class Game {
    var Question = "what?"
    var Answer = ""
}
fun main(args: Array<String>){
    var game = Game()
    game.Answer = "42"
    var message:String
    if(game.Answer == "42"){
        message = "ok"}
    else{
        message="wrong answer"}
    println(message)
    val msg = if(game.Answer == "42") "ok" else "wrong answer"
    println(msg)
}


