package lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    // Время начала пути в минутах от полуночи
    val departureTimeMinutes = departureHour * MINUTES_IN_HOUR + departureMinute

    // Время прибытия в минутах от начала пути
    val arrivalTimeMinutes = departureTimeMinutes + travelTimeMinutes

    // Перевод общего количество минут в часы и минуты прибытия
    val arrivalHour = arrivalTimeMinutes / MINUTES_IN_HOUR
    val arrivalMinute = arrivalTimeMinutes % MINUTES_IN_HOUR

    println("Время начала пути: %02d:%02d".format(departureHour,departureMinute))
    println("Время в пути: %02d:%02d".format(
        travelTimeMinutes / MINUTES_IN_HOUR, travelTimeMinutes % MINUTES_IN_HOUR))
    println("Поезд прибудет в %02d:%02d".format(arrivalHour, arrivalMinute))
}