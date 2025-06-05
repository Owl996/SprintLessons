package lesson_2

import kotlin.math.pow

const val PERCENT_DIVISOR = 100

fun main() {

    val startSum = 70_000
    val annualRatePercent = 16.7

    // перевод процентов в десятичную дробь
    val annualRate = annualRatePercent / PERCENT_DIVISOR
    val years = 20
    // S = P * (1 + i)^n
    val compoundInterestResult = startSum * (1 + annualRate).pow(years)

    println("Результат вклада на $years составит %.3f".format(compoundInterestResult))
}