package lesson_4

const val MAX_MEMBERS_OF_CREW = 70
const val MIN_MEMBERS_OF_CREW = 55
const val MIN_BOXES_WITH_PROVISIONS = 55

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
    val expeditionCanStarted =
            !shipHasDamage && currentMembersOfCrew in MIN_MEMBERS_OF_CREW..MAX_MEMBERS_OF_CREW
            && boxesWithProvisions > MIN_BOXES_WITH_PROVISIONS || currentMembersOfCrew == MAX_MEMBERS_OF_CREW
            && favorableWeather && boxesWithProvisions >= MIN_BOXES_WITH_PROVISIONS

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


