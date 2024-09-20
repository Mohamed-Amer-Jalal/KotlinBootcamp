package classes

fun main() {
    makeFish()
    delegate()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color} \n Plecostomus: ${pleco.color}")
    shark.eat()
    pleco.eat()
}

//fun newFeedFish(fish: FishAction) { fish.eat() }

fun delegate() {
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

abstract class AquariumFish { abstract val color: String }

class Shark: AquariumFish(), FishAction {
    override val color = "gray"
    override fun eat() { println("hunt and eat fish") }
}

class Plecostomus(fishColor: FishColor = GoldColor): FishAction by PrintingFishAction("a lot of algae"), FishColor by fishColor

object GoldColor: FishColor { override val color = "gold" }

object RedColor: FishColor { override val color = "red" }

class PrintingFishAction(private val food: String): FishAction { override fun eat() { println(food) } }

interface FishAction { fun eat() }

interface FishColor  { val color: String }