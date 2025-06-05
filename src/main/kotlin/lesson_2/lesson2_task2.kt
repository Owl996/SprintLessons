package lesson_2

const val BASE_SALARY = 3_00_00
const val INTERN_SALARY = 2_00_00

fun main() {

    val currentCountEmployees = 50
    val numberOfInterns = 30

    val currentSalaryExpenses = (currentCountEmployees * BASE_SALARY)
    val salaryExpensesWithInterns = (currentSalaryExpenses + numberOfInterns * INTERN_SALARY)
    val averageSalary = (salaryExpensesWithInterns / (currentCountEmployees + numberOfInterns))

    println("Текущие траты на постоянных сотрудников $currentSalaryExpenses")
    println("Текущие траты на постоянных сотрудников и стажеров $salaryExpensesWithInterns")
    println("Средняя зарплата каждого сотрудника , включая стажеров $averageSalary")

}