const val MAX_EXPERIENCE: Int = 5000

fun main() {
    val playerName = "Estragon"
    var experiencePoints = 5
    experiencePoints += 5
    var money = 500
    var hasSteed = false

    val tavernName = "Рог единорога"
    val menu = listOf("Мед", "Вино", "Пиво")
    println(experiencePoints)
    println(playerName.reversed())
    runSimulation()

}

fun runSimulation(){
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
}

fun configureGreetingFunction(): (String) -> String{
val structureType = "hospitals"
var numBuildings = 5
return { playerName: String ->
    val  currentYear = 2020
    numBuildings += 1
    println("Adding $numBuildings $structureType")
    "Welcome to SimVillage, $playerName! (copyright $currentYear)"
}
}
