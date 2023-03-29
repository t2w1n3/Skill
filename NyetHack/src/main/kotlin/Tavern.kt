import java.io.File
import kotlin.math.roundToInt

const val TAVERN_NAME = "Taernyl's Folly"

var dragonsBreathBarrel = 5

fun saleDragonsBreathBarrel(pint : Int){
    val pintCount = pint * 0.125
    val remainsDragonsBreathBarrel = (dragonsBreathBarrel - pintCount).toDouble()

    println(remainsDragonsBreathBarrel)
}
val patronList = mutableListOf("Eli", "Madrigal", "Sophie")
val lastName = listOf("Ironfoot","Fernswords","Baggins")
val uniquePatrons = mutableSetOf<String>()
val testList = mutableListOf<String>()
val patronGold = mutableMapOf<String,Double>()

fun performPurchase(price: Double, patronName: String){
    val  totalPurse = patronGold.getValue(patronName)
    patronGold[patronName] = totalPurse - price
}
val menuList = File("data/tavern-menu-data.txt").readText().split(".")


fun main() {
    placeOrder("shandy,Dragons Breath, 5.91")
    placeOrder("shandy,Dragons Breath, 5.91")
    saleDragonsBreathBarrel(12)
    println(patronList.getOrElse(4) {"Unknown Patron"})
    if (patronList.contains("Eli")){
        println("The tavern master says: Eli in the vack playing vards")
    }else {
        println("The tavern master says: Elin is not in her")
    }
    if (patronList.containsAll(listOf( "Madrigal", "Sophie"))){
        println("The tavern master says: Yra, they seated by the ste kettle")
    }else{
        println("The tavern master says: Nay, thet departed hours ago")
    }
    for (patron in patronList){
        println("Good morning $patron!")
    }
    println(patronList)
    patronList.remove("Eli")
    patronList.add("Alex")
    println(patronList)
    patronList.forEach{patron -> println("Good morning $patron!") }
    menuList.forEachIndexed{index, data -> println("$index : $data") }
    uniquePatrons.forEach{patronGold[it] = 6.0 }
    (0..9).forEach{
        val first = patronList.shuffled().first()
        val last = lastName.shuffled().last()
        val name = "$first $last"
        uniquePatrons += name
        testList += name
        testList.distinct()
        println(uniquePatrons)
    }
    newMenu()
    println()

    //В цело тут можно делать вызов через синтаксис  patronGold["Eli"]
//    println(patronGold.getValue("Eli"))
}


private fun toDragonSpeak(phrase: String) =
    phrase.replace(Regex("[aeiou]")){
        when (it.value) {
            "a" -> "4"
            "e" -> "3"
            "i" -> "1"
            "o" -> "0"
            "u" -> "|_|"
            else -> it.value
        }
    }

private fun displayBalance(){
    patronGold.forEach{patron, balance -> println("$patron, balance: ${"%.2f".format(balance)}") }

}
private fun newMenu(){
    println("*** Welcome to $TAVERN_NAME ***")
    println()
    var i  = 0
    var y = 0

    var nameBeer = mutableListOf<String>()
    var price = mutableListOf<String>()

    while (i < 11) {
        if (i % 2 != 1){
            nameBeer.add(menuList[i])
            i += 1
        }else{
            price.add(menuList[i])
            i += 1
        }
    }
    while (y < 5){
    print(nameBeer[y].padEnd(34,'.') +price[y])
        y++
    }
}

private fun placeOrder(menuData: String){
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    var countOrder = 0
    println("Madrigal spaeks with $tavernMaster about their order")
    val (type, name , price) = menuData.split(',')
//    performPurchase(price.toDouble(),name)
    val massage = "Madrigal buys a $name ($type) for $price"


     println(massage)
}
