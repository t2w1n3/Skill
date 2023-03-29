

fun main() {
    val race = "gnome"
    val name = "Madrigal"
    var healthPoint = 6
    val isBlessed = true
    val isImmortal = false
    //Карма
    val karma = (Math.pow(Math.random(), (110 - healthPoint) / 100.0) * 20 ).toInt()
    // Цвет Ауры
    var auraColor = if (isBlessed && isBlessed || isImmortal) {
         when (karma) {
            in 16..20 -> "green"
            in 11..15 -> "purple"
            in 6..10 -> "orange"
             else -> "red"
         }
    }else "None Aura"



    //Проверка фракций
    val faction = when (race){
        "dwarf" -> "Keep of the Miners"
        "gnome" -> "Keep of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> "nope"
    }

    // Проверка состояния здоровья
    val healthStatus = when (healthPoint) {
        100 ->  " is in excellent condition"
        in 90..99 -> " has a few scratches"
        in 75..89 -> if (isBlessed){
            " has some minor wounds but is healing qiute quickly"
        }else {
            " has some minor wounds"
        }
        in 15..74 -> " looks pretty hurt"
        else -> " is in awful condition"
    }
    //Вывод рассы и имени
    println("$name is $race")
    //Состояние игрока
    println("$name $healthStatus")
    //Вывод сведений о ауре
    println("Aura is $auraColor")

    val statusFormatString = "(HP : $healthPoint)(Aura: $auraColor) -> $name$healthStatus"
    println("$statusFormatString")
}
