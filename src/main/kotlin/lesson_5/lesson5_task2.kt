package lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {

    println("Введите ваш год рождения:")
    val userInput = readln().toIntOrNull()

    val currentYear = LocalDate.now().year

    val isMajorityAge = if (userInput != null) {
        currentYear - userInput >= AGE_OF_MAJORITY
    } else
        println("Некорректные данные")

    when (isMajorityAge) {
        true -> println("Показать экран со скрытым контентом")
        false -> println("Доступ запрещен")
    }
}