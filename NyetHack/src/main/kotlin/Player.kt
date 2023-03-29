class Player {
    //Свойствам класса обязательно здавать значения таклй формат обьявления недопустим
    var name = "Madrigal"
        get()=field.capitalize()
        private set(value){
            field = value.trim()
        }

    val race = "Human"
          get()=field
    var healthPoint = 80
    val isBlessed = true
    private val isImmortal = false

    fun formatHealingStatus(): String {
        val healthStatus = when (healthPoint) {
            100 -> " is in excellent condition"

            in 90..99 -> " has a few scratches"
            in 75..89 -> if (isBlessed) {
                " has some minor wounds but is healing qiute quickly!"
            } else {
                " has some minor wounds"
            }
            in 15..74 -> " looks pretty hurt"
            else -> " is in awful condition"
        }
        return healthStatus
    }

     fun auraColor():String{
        val auraColor = if (isBlessed && healthPoint > 50 || isImmortal){
            "Aura is green"
        }else{
            "None Aura"
        }
        return  auraColor
    }

    fun castFireball(numberFireballs: Int = 2){
        println("A glass of Fireball springs ito existens. (x$numberFireballs)")
    }
}