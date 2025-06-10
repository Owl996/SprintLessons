package lesson_5

import kotlin.math.pow

fun main() {

    println("Здравствуйте, для вычисления индекса массы тела нам необходимо знать ваш:\n-Вес\n-Рост")

    println("Пожалуйста , введите ваш вес в килограммах:")

    val userInputWeight = readln().trim().toDoubleOrNull()

    println("Пожалуйста , введите ваш рост в сантиметрах:")

    val userInputHeight = readln().trim().toFloatOrNull()

    var bmi = 0.0

    if (userInputWeight != null && userInputHeight != null) {
        val centimetersToMetras = (userInputHeight / 100)
        bmi = userInputWeight / centimetersToMetras.pow(2)
    }

    println("индекс массы тела %.2f соответствует категории:".format(bmi))

    when {
        (bmi < 18.5) -> println("Недостаточная масса тела")

        18.5 <= bmi && bmi < 25.0 -> println("Нормальная масса тела")

        25 <= bmi && bmi < 30 -> println("Избыточная масса тела")

        bmi >= 30 -> println("Ожирение")
    }
}