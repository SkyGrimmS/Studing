fun main() {
   val x = 10
    while (x>1) {
    val timeOutside = timeOutside()
    val weatherOutside = weatherOutside()

    if (timeOutside && weatherOutside) {
        println("Йди гуляти")
    } else if (timeOutside) {
        println("Читай книгу")
    } else {
        println("Йди спати")
    }
        x-1
}

}


    fun timeOutside(): Boolean {
        println("Котра зараз година?")
        val inputTime = readln().toInt()
        val timeState = inputTime in 9..24
        return timeState
    }


    fun weatherOutside(): Boolean {
        println("Чи хороша погода на вулиці? true/false")
        val inputWeatherStatus = readln().toBoolean()
        return inputWeatherStatus

    }