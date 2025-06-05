package lesson_2

fun main() {

    val grades = listOf(3, 4, 3, 5)
    val gradesSum = grades.sum()
    val averageGrade = (gradesSum.toDouble() / grades.size)

    println(averageGrade)
}