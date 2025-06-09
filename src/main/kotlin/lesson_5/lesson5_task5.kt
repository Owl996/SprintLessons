package lesson_5

const val MIN_NUMBER_VALUE = 0
const val MAX_NUMBER_VALUE = 42

fun main() {

    val firstRandomNumber = (MIN_NUMBER_VALUE..MAX_NUMBER_VALUE).random()
    val secondRandomNumber = (MIN_NUMBER_VALUE..MAX_NUMBER_VALUE).random()
    val thirdRandomNumber = (MIN_NUMBER_VALUE..MAX_NUMBER_VALUE).random()

    println("Введите введите три ваших числа через запятую в диапазоне от 0 до 42.\n Например: 33,22,15")

    val userInput = readln()

    val splitUserMessage = userInput.split(",")

    if (splitUserMessage.size != 3) {
        println("Некорректные данные\n Введите три числа через запятую, пример: 32,26,18")
        return
    }

    try {
        val firstNumber = splitUserMessage[0].trim().toInt()
        val secondNumber = splitUserMessage[1].trim().toInt()
        val thirdNumber = splitUserMessage[2].trim().toInt()

        if (firstNumber !in MIN_NUMBER_VALUE..MAX_NUMBER_VALUE ||
            secondNumber !in MIN_NUMBER_VALUE..MAX_NUMBER_VALUE ||
            thirdNumber !in MIN_NUMBER_VALUE..MAX_NUMBER_VALUE
        ) {
            println("Ошибка: ваши числа должны быть в диапазоне от $MIN_NUMBER_VALUE до $MAX_NUMBER_VALUE.")
            return
        }

        val userNumbers = setOf(firstNumber, secondNumber, thirdNumber)
        val winningNumbers = setOf(firstRandomNumber, secondRandomNumber , thirdRandomNumber)

        val matchedCount = userNumbers.intersect(winningNumbers).size

        when (matchedCount) {
            3 -> println("Поздравляем! Вы выиграли главный приз!")
            2 -> println("Вы угадали два числа и получаете утешительный приз")
            1 -> println("Вы угадали только одно число и получаете утешительный приз")
            else -> println("Неудача!")
        }

        println("Выигрышные числа были: [$firstRandomNumber | $secondRandomNumber | $thirdRandomNumber]")

    } catch (e: NumberFormatException) {
        println("Некорректные данные")
    }
}