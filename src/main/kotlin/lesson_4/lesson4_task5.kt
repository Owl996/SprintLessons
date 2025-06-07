package lesson_4

fun main() {

    // Пользовательский ввод о повреждениях корабля
    val shipHasDamage = shipDamageUserInput()

    // Пользовательский ввод о количестве членов команды
    var currentMembersOfCrew: Int? = null
    while (currentMembersOfCrew == null) {

        println("Введите текущие количество членов экипажа")
        val membersOfCrewUserInput = readln().toIntOrNull()
        if (membersOfCrewUserInput != null) {
            currentMembersOfCrew = membersOfCrewUserInput
        } else println("Некорректные данные")
    }

    // Пользовательский ввод о количестве ящиков с провизией
    var boxesWithProvisions: Int? = null
    while (boxesWithProvisions == null) {

        println("Введите количество ящиков с провизией на борту")
        val boxesWithProvisionsUserInput = readln().toIntOrNull()
        if (boxesWithProvisionsUserInput != null) {
            boxesWithProvisions = boxesWithProvisionsUserInput
        } else println("Некорректные данные")
    }

    // Пользовательский ввод о состоянии погоды
    val favorableWeather = favorableWeatherUserInput()

    // Определение может ли корабль начать экспедицию
    val expeditionCanStarted = !shipHasDamage && currentMembersOfCrew in 55..70 && boxesWithProvisions > 50
            || currentMembersOfCrew == 70 && favorableWeather && boxesWithProvisions >= 50

    if (expeditionCanStarted) {
        println("Корабль может начать экспедицию")
    } else
        println("Корабль не может начать экспедицию")
}

fun shipDamageUserInput(): Boolean {
    while (true) {
        println(
            """
        "Корабль имеет повреждения?"
        1 - Да
        2 - Нет
    """.trimIndent()
        )
        when (readln().toIntOrNull()) {
            1 -> return true
            2 -> return false
            else -> println("Некорректные данные , попробуйте снова")
        }
    }
}

fun favorableWeatherUserInput(): Boolean {
    while (true) {
        println(
            """
        "Выберите состояние погоды"
        1 - Благоприятная
        2 - Неблагоприятная
    """.trimIndent()
        )
        when (readln().toIntOrNull()) {
            1 -> return true
            2 -> return false
            else -> println("Некорректные данные , попробуйте снова")
        }
    }
}


