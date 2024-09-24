package compose.quiz

fun main() {
    val smartTv = SmartTvDevice(name = "Smart TV", category = "Entertainment", deviceType = "Television")
    val smartLight = SmartLightDevice(name = "Smart Light", category = "Utility", deviceType = "Lighting")

    val smartHome = SmartHome(smartTv, smartLight)

    // Turn on devices
    smartHome.turnOnDevices()

    // Perform TV and light operations
    smartHome.printSmartTvInfo()
    smartHome.decreaseTvVolume()
    smartHome.changeTvChannelToPrevious()

    smartHome.printSmartLightInfo()
    smartHome.decreaseLightBrightness()

    println("Devices turned on: ${smartHome.deviceTurnOnCount}")
}


open class SmartDevice(
    val name: String,
    private val category: String,
    private val deviceType: String,
    var deviceStatus: String = "off"
) {
    fun printDeviceInfo() {
        println("Device name: $name, category: $category, type: $deviceType")
    }

    fun turnOn() {
        deviceStatus = "on"
    }

    fun turnOff() {
        deviceStatus = "off"
    }
}

class SmartTvDevice(
    name: String,
    category: String,
    deviceType: String,
    private var volume: Int = 50,
    private var channel: Int = 1
) : SmartDevice(name, category, deviceType) {

    fun decreaseVolume() {
        if (deviceStatus == "on" && volume > 0) {
            volume--
            println("TV volume decreased to $volume")
        }
    }

    fun previousChannel() {
        if (deviceStatus == "on" && channel > 1) {
            channel--
            println("TV channel switched to $channel")
        }
    }
}

class SmartLightDevice(
    name: String,
    category: String,
    deviceType: String,
    private var brightness: Int = 100
) : SmartDevice(name, category, deviceType) {

    fun decreaseBrightness() {
        if (deviceStatus == "on" && brightness > 0) {
            brightness--
            println("Light brightness decreased to $brightness")
        }
    }
}

class SmartHome(
    private val tv: SmartTvDevice,
    private val light: SmartLightDevice,
    var deviceTurnOnCount: Int = 0
) {
    fun turnOnDevices() {
        if (tv.deviceStatus == "off") {
            tv.turnOn()
            deviceTurnOnCount++
        }
        if (light.deviceStatus == "off") {
            light.turnOn()
            deviceTurnOnCount++
        }
    }

    fun decreaseTvVolume() {
        if (tv.deviceStatus == "on") {
            tv.decreaseVolume()
        } else {
            println("TV is off, cannot decrease volume.")
        }
    }

    fun changeTvChannelToPrevious() {
        if (tv.deviceStatus == "on") {
            tv.previousChannel()
        } else {
            println("TV is off, cannot change channel.")
        }
    }

    fun printSmartTvInfo() {
        tv.printDeviceInfo()
    }

    fun printSmartLightInfo() {
        light.printDeviceInfo()
    }

    fun decreaseLightBrightness() {
        if (light.deviceStatus == "on") {
            light.decreaseBrightness()
        } else {
            println("Light is off, cannot decrease brightness.")
        }
    }
}