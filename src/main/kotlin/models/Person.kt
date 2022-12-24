package models

import interfaces.Human
import kotlin.math.roundToInt

class Person (
    override var name: String,
    override var age: Int,
    override var sex: String,
    override var energy: Double,
    ) : Human {

    override fun say(message: String) {
        println("$name say $message")
        energy -= 3 * message.length
        getCurrentEnergy()
    }

    override fun walk(distance: Int) {
        println("$name walking to $distance meters")
        energy -= distance * 0.1
        getCurrentEnergy()
    }

    override fun eat(food: Food) {
        println("$name eating ${food.name}")
        energy += food.calories.toDouble()
        getCurrentEnergy()
    }

    override fun sleep(hours: Int) {
        println("$name sleeping $hours hours")
        energy += (10 * hours).toDouble()
        getCurrentEnergy()
    }

    override fun getCurrentEnergy() {
        println("$name have left ${energy.roundToInt()} calories")
    }

    fun isHurt(): Boolean {
        return age > 50 && energy < 200 || energy < 100
    }

}