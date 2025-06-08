package lesson_4

const val IS_TRUE = true
const val IS_FALSE = false
const val Favorable_PERCENT_AIR_HUMIDITY = 20
const val WINTER_SEASON = "Зима"

fun main() {

    val isSunny = IS_TRUE
    val isAwningOpen = IS_FALSE
    val airHumidity = Favorable_PERCENT_AIR_HUMIDITY
    val currentSeason = WINTER_SEASON

    println("[Благоприятные ли условия сейчас для роста бобовых? " +
            (isSunny && isAwningOpen && airHumidity == Favorable_PERCENT_AIR_HUMIDITY
                    && (currentSeason != WINTER_SEASON)))
}


