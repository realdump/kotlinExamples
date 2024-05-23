open class SmartDevice(val name: String, val category: String){
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
    open fun turnOn(){
        println("Smart device is turned on.")
    }
    open fun turnOff(){
        println("Smart device is turned off.")
    }
}


class SmartTVDevice(deviceName: String, deviceCategory: String) : SmartDevice(name = deviceName, category = deviceCategory){
    var speakerVolume = 2
        set(value){
            if (value in 0..100){
                field = value
            }
        }
    var channelNumber = 1
        set(value){
            if (value in 0..200){
                field = value
            }
        }
    fun increaseSpeakerVolume(){
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }
    fun nextChannel(){
        channelNumber++
        println("Channel number incresed to $channelNumber")
    }
    override fun turnOn(){
        super.turnOn()
        //deviceStatus = "on"
        println("$name is turned on. Speaker volume is set to $speakerVolume and channel number is set to $channelNumber.")
    }
    override fun turnOff(){
        //deviceStatus = "off"
        super.turnOff()
        println("$name turned off")
    }
}
class SmartLightDevice(deviceName: String, deviceCategory: String) : SmartDevice(name = deviceName, category = deviceCategory){
    var brightnessLevel = 0
        set(value) {
            if (value in 0..100){
                field = value
            }
        }
    fun increaseBrightness(){
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }
    override fun turnOn(){
        deviceStatus = "on"
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }
    override fun turnOff(){
        deviceStatus = "off"
        brightnessLevel = 0
        println("Smart Light turned off.")
    }

}
class SmartHome(val smartTVDevice: SmartTVDevice, val smartLightDevice: SmartLightDevice){

    fun turnOnTV(){
        smartTVDevice.turnOn()
    }

    fun turnOffTV(){
        smartTVDevice.turnOff()
    }

    fun increaseVolume(){
        smartTVDevice.increaseSpeakerVolume()
    }
    fun changeTvChannelToNext(){
        smartTVDevice.nextChannel()
    }
}
fun main(){
    var smartDevice: SmartDevice = SmartTVDevice("Android TV", "Entertainment")
    //println("Device name is: ${smartTvDevice.name}")
    smartDevice.turnOn()
    //smartTvDevice.turnOff()
    smartDevice = SmartLightDevice ("Google Light", "Utility")
    smartDevice.turnOn()
}