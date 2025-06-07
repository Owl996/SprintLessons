package lesson_4

const val TOTAL_TABLES = 13

fun main() {

    val reservedTablesToday = TOTAL_TABLES
    val reservedTablesTomorrow = 9

    val availableToday = TOTAL_TABLES > reservedTablesToday
    val availableTomorrow = TOTAL_TABLES > reservedTablesTomorrow

    println("[Доступность столиков на сегодня: $availableToday],\n" +
            "[Доступность столиков на завтра: $availableTomorrow].")

}
