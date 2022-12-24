package interfaces

import models.Food

interface Human {
    var name: String
    var age: Int
    var sex: String
    var energy: Double

    fun say(message: String)
    fun walk(distance: Int)
    fun eat(food: Food)
    fun sleep(hours: Int)

    fun getCurrentEnergy()
}