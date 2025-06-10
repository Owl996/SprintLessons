package lesson_5

fun main() {

    println("Введите расстояние поездки в километрах")

    val userInputTravelDistance = readln().trim().toFloatOrNull()

    println("Введите расход топлива на 100 километров")

    val userInputFuelConsumptionLPer100Km = readln().trim().toFloatOrNull()

    println("Введите цену за литр топлива")

    val userInputFuelPricePerLiter = readln().trim().toFloatOrNull()

    var fuelRequired = 0.0f

    if (userInputTravelDistance != null && userInputFuelConsumptionLPer100Km != null) {
        fuelRequired = ((userInputTravelDistance * userInputFuelConsumptionLPer100Km) / 100)
    } else
        println("Некорректные данные")

    var currentPrice = 0.0f

    if (userInputFuelPricePerLiter != null) {
        currentPrice = fuelRequired * userInputFuelPricePerLiter
    } else
        println("Некорректные данные")

    println(
        "Для поездки на дистанцию: %.2f вам необходимо: %.2f литров топлива, общая стоимость которого на данный момент составит: %.2f"
                    .format(userInputTravelDistance, fuelRequired, currentPrice))
}