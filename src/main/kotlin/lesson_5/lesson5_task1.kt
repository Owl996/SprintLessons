package lesson_5

fun main() {

    println("Нам нужно проверить что вы не робот , пожалуйста , решите следующий пример: ")

    val firstNumber = (1..9).random()
    val secondNumber = (1..9).random()

    println("$firstNumber + $secondNumber")

    val userInput = readln().toIntOrNull()

    if (userInput == firstNumber + secondNumber) {
        println("Добро пожаловать!")
    } else
        println("Доступ запрещен.")
}