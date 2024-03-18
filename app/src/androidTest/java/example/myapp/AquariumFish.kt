package example.myapp

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

class Plecostomus(fishColor: FishColor = GoldColor) : FishAction, FishColor by fishColor {
    override fun eat() {
        println("eat algae")
    }
}

class Shark : FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

abstract class AquariumFish : FishAction {
    abstract val color: String
    override fun eat() {
        println("yum")
    }
}

fun main() {
    val pleco = Plecostomus()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()

    val shark = Shark()
    println("Shark: ${shark.color}")
    shark.eat()
}