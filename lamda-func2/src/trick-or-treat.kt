fun main(){
    val trickFunction = trick
    trick()
    trickFunction()
    treat()
}
val trick = {
    println("No treats!")
}
/*val treat = {
    println("Have a treat!")
}*/
val treat: () -> Unit = {
    println("Have a treat!")
}