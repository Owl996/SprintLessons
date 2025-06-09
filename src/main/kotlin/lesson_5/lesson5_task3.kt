package lesson_5

const val MIN_NUMBER_ROLL = 0
const val MAX_NUMBER_ROLL = 42

fun main() {

    val firstRandomNumber = (MIN_NUMBER_ROLL..MAX_NUMBER_ROLL).random()
    val secondRandomNumber = (MIN_NUMBER_ROLL..MAX_NUMBER_ROLL).random()

    println("Введите введите два ваших числа через запятую в диапазоне от 0 до 42.\n Например: 33,22")

    val userInput = readln()

    val splitUserMessage = userInput.split(",")

    if (splitUserMessage.size != 2) {
        println("Некорректные данные\n Введите два числа через запятую, пример: 32,23")
        return
    }

    try {
        val firstNumber = splitUserMessage[0].trim().toInt()
        val secondNumber = splitUserMessage[1].trim().toInt()

        if (firstNumber !in MIN_NUMBER_VALUE..MAX_NUMBER_VALUE || secondNumber !in MIN_NUMBER_VALUE..MAX_NUMBER_VALUE) {
            println("Ошибка: ваши числа должны быть в диапазоне от $MIN_NUMBER_VALUE до $MAX_NUMBER_VALUE.")
            return
        }

        val userNumbers = setOf(firstNumber, secondNumber)
        val winningNumbers = setOf(firstRandomNumber, secondRandomNumber)

        val matchedCount = userNumbers.intersect(winningNumbers).size

        when (matchedCount) {
            2 -> println("Поздравляем! Вы выиграли главный приз!")
            1 -> println("Вы выиграли утешительный приз!")
            else -> println("Неудача!")
        }

        println("Выигрышные числа были: $firstRandomNumber и $secondRandomNumber")

    } catch (e: NumberFormatException) {
        println("Некорректные данные")
    }
}