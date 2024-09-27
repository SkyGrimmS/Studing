fun main() {

    val time = leftTime()
    println(time)

}
fun leftTime(): String {

    val secondsInput = readln().toInt()
    val secondsCalculation = secondsInput/60
    val minutesCalculation = secondsInput%60
    return "Залишок часу: $minutesCalculation:$secondsCalculation"

}

