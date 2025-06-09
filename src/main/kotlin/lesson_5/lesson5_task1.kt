package lesson_5

const val MIN_NUMBER = 1
const val MAX_NUMBER = 9

fun main() {

    println("Нам нужно проверить что вы не робот , пожалуйста , решите следующий пример: ")

    val firstNumber = (MIN_NUMBER..MAX_NUMBER).random()
    val secondNumber = (MIN_NUMBER..MAX_NUMBER).random()

    println("$firstNumber + $secondNumber\n ваш ответ:")

    val userInput = readln().toIntOrNull()

    if (userInput == firstNumber + secondNumber) {
        println("Добро пожаловать!")
    } else
        println("Доступ запрещен.")
}