package lesson_4

fun main() {

    val currentTrainingDay = 5

    val armsAndAbs = (currentTrainingDay % 2) != 0
    val legsAndBack = (currentTrainingDay % 2) == 0

    println(
        """
        Упражнения для рук:       $armsAndAbs
        Упражнения для ног:       $legsAndBack
        Упражнения для спины:     $legsAndBack
        Упражнения для пресса:    $armsAndAbs
    """.trimIndent()
    )
}


