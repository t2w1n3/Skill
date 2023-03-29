fun main() {

    val player = Player()

    printPlayerStatus(player)

}
private fun printPlayerStatus(player: Player){
    println("(Aura: ${player.auraColor()}auraColor) (Blessed: ${if (player.isBlessed) "Yes" else "No"})")
    println("${player.name}name is ${player.race}")
    println("${player.name}${player.formatHealingStatus()}")
}




