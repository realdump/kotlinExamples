fun main(){
    val coins: (Int) -> String = {
        quantity -> "$quantity quarters"
    }
    val cupcake: (Int) -> String = {
    "Have a cupcake!"
    }
    val treatFunction = trickOrTreat(false, coins)
    val trickFunction = trickOrTreat(true, null)
    treatFunction()
    trickFunction()
}
fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit{
   if (isTrick){
        return trick
    } else {
        if(extraTreat != null){
            println(extraTreat(5))
        }
        return treat
    }
}
val trick = {
    println("No treats!")
}
val treat = {
    println("Have a treat!")
}
