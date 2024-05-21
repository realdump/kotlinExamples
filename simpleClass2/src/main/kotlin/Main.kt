class SmartDevice(val name: String, val category: String){
    //val name = "Android TV"
    //val category = "Entertainment"
    var deviceStatus = "online"
    constructor(name: String, category: String, statusCode: Int) : this(name, category){
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
    fun turnOn(){
        println("Smart device is turned on.")
    }
    fun turnOff(){
        println("Smart device is turned off.")
    }
}
fun main(){
    val  smartTvDevice = SmartDevice(name = "Android TV", category = "Entertainment")
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}
