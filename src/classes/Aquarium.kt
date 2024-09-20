package classes

import kotlin.math.PI


fun main() {
    buildAquarium()
//    TowerTank()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} " + "Width: ${myAquarium.width} " + "Height: ${myAquarium.height}")

    myAquarium.height = 80
    println("Height: ${myAquarium.height} cm")
    println("Height: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Small Aquarium2: ${myAquarium2.volume} liters with " +
            "Length: ${myAquarium2.length} " + "Width: ${myAquarium2.width} " + "Height: ${myAquarium2.height}")
}

open class Aquarium(var width: Int = 20, var height: Int = 40, var length: Int = 100) {

    open var volume: Int get() { return width * height * length / 1000}
        set(value) {height = (value * 1000) / (width * length)}

    @Suppress("LeakingThis")
    open var water = volume * 0.9

    constructor(numberOfFish: Int): this() {
        val water = numberOfFish * 2000 //cm3
        val tank = water * 0.1
        height = (tank / (length * width)).toInt()
    }
}

class TowerTank: Aquarium() {
    override var water = volume * 0.8
    override var volume: Int get() = (width * height * length / 1000 * PI).toInt()
        set(value) { height = (value * 1000) / (width * length)}
}