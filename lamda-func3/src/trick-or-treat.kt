fun main(){
    val treatFunction = trickOrTreat(false)
    val trickFunction = trickOrTreat(true)
    treatFunction()
    trickFunction()
}
fun trickOrTreat(isTrick: Boolean): () -> Unit{
    return if (isTrick){
        trick
    } else {
        treat
    }
}
val trick = {
    println("No treats!")
}
val treat = {
    println("Have a treat!")
}
