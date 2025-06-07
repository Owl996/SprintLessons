package lesson_4

fun main() {

    val sunnyWeather = true
    val awning = true
    val airHumidity = 20
    val currentSeason = "Зима"

    println("[Благоприятные ли условия сейчас для роста бобовых? " +
            (sunnyWeather && awning && airHumidity == 20 && (currentSeason != "Зима")))




}


