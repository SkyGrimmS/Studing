fun main() {
    println("Введыть вік учасників!")
    val ageJohn = readln().toInt()
    val ageMark = readln().toInt()
    val ageLucy = readln().toInt()

    val averageAgeResult = averageAgeCalculate(ageJohn, ageMark, ageLucy).toInt()
    println(averageAgeResult)
}


fun averageAgeCalculate(ageJohn:Int, ageMark: Int, ageLucy:Int): Double {
    val ageSum = ageMark + ageLucy + ageJohn
    val averageAge = (ageSum/3.0)
    return averageAge
}

