import models.Food
import models.Person
import kotlin.random.Random

fun main(args: Array<String>) {
    val foodList: List<Food> = listOf(
        Food("Meat", 500),
        Food("Chocolate", 200),
        Food("Potatoes", 100),
        Food("Juice", 50),
    )

    val hero = Person("Jack", 55, "man", 500.0)
    println(hero.run {
        say("Goodbye my work")
        walk(1000)
        eat( getRandomFood(foodList) )
        sleep(8)
        say("Good morning family")
        walk(1500)
        say("Hello my work partners")
        eat( getRandomFood(foodList) )
        say("Lunch with my love on work")
        walk(500)
        say("Hello market")
        walk(1000)
        say("Hello my family")
        eat( getRandomFood(foodList) )
        say("Good night")
        sleep(9)
    })

    if ((hero.energy > 100 && !hero.isHurt()) || (hero.energy > 500 && hero.isHurt())) {
        println("You are alive")
    }
    else {
        println("Yor are died")
    }
}

private fun getRandomFood(foodList: List<Food>): Food {
    return foodList[ Random.nextInt(0, foodList.size - 1) ]
}