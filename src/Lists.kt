fun main() {
    val numberOfDaysInMonths = listOf(31,29,31,30,31,30,31,31,30,31,30,31)
    println("Введіть порядковий номер місяця:")
    val inputNumberOfTheMonth = readln().toInt()

    if (inputNumberOfTheMonth in 1..12) {
        val outputMonthDays = numberOfDaysInMonths[inputNumberOfTheMonth-1]
        println(outputMonthDays)
    }else{
        println("Введене неправильне значення")
    }
}