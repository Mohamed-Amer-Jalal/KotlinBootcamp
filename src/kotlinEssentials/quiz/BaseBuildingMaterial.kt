package kotlinEssentials.quiz

import kotlin.math.pow

open class BaseBuildingMaterial(val numberNeeded: Int = 1)

class Wood : BaseBuildingMaterial(4)

class Brick : BaseBuildingMaterial(8)

class Building<T : BaseBuildingMaterial>(private val buildingMaterial: T) {
    private val baseMaterialsNeeded = 100
    val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * buildingMaterial.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("Small building")
    } else {
        println("Large building")
    }
}

fun main() {
    val woodBuilding = Building(Wood())
    woodBuilding.build()
    val brickBuilding = Building(Brick())
    brickBuilding.build()

    val array = Array(7) { 1000.0.pow(it) }
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte")
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }
}