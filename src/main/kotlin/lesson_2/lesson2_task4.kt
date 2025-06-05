package lesson_2

const val SUPER_BUFF = 120
const val PERCENTAGE_DIVISOR = 100

fun main() {

    val crystals = 7
    val ironOre = 12

    val crystalsWithBuff = (crystals * SUPER_BUFF / PERCENTAGE_DIVISOR)
    val ironOreWithBuff = (ironOre * SUPER_BUFF / PERCENTAGE_DIVISOR)

    println("Crystals with buff $crystalsWithBuff")
    println("Metal ore with buff  $ironOreWithBuff")
}