package kotlinEssentials

fun main() = genericExample()

open class WaterSupply(var needsProcessed: Boolean)

class TapWater: WaterSupply(true) { fun addChemicalCleaners() = apply { needsProcessed = false } }

class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true) { fun filter() = apply { needsProcessed = false } }

class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if(waterSupply.needsProcessed) { cleaner.clean(waterSupply) }
        check(!waterSupply.needsProcessed) {"Water Supply Needs Processed"}
        println("Adding Water From $waterSupply") }
}

inline fun <reified R: WaterSupply>Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

interface Cleaner<in T: WaterSupply> { fun clean(waterSupply: T) }

class TapWaterCleaner: Cleaner<TapWater> { override fun clean(waterSupply: TapWater) { waterSupply.addChemicalCleaners() } }

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("Item Added $aquarium")

fun <T: WaterSupply>isWaterClean(aquarium: Aquarium<T> ) = println("Aquarium Water Is Clean ${aquarium.waterSupply.needsProcessed}")

inline fun <reified T: WaterSupply> WaterSupply.isOFType() = this is T

fun genericExample() {
    val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()

    val aquarium2 = Aquarium(LakeWater())
    aquarium2.waterSupply.filter()

    addItemTo(aquarium)

    val cleaner = TapWaterCleaner()
    aquarium.addWater(cleaner)

    isWaterClean(aquarium)
    aquarium.hasWaterSupplyOfType<TapWater>() // true
    aquarium.waterSupply.isOFType<LakeWater>() // false
}