package lesson_4

const val EVEN_DAY: Int = 2
const val REMAINDER_ZERO: Int = 0

fun main() {

    val currentTrainingDay = 5

    val isArmsAndAbsDay = (currentTrainingDay % EVEN_DAY) != REMAINDER_ZERO
    val isLegsAndBackDay = (currentTrainingDay % EVEN_DAY) == REMAINDER_ZERO

    println(
        """
        Упражнения для рук:       $isArmsAndAbsDay
        Упражнения для ног:       $isLegsAndBackDay
        Упражнения для спины:     $isLegsAndBackDay
        Упражнения для пресса:    $isArmsAndAbsDay
    """.trimIndent()
    )
}


