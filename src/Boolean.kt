//Потрібно буде вивести чи темтепратура низька/нормальна/висока
//


fun main() {
    calculateTemperature()
    println("Я всеодно працюю")
}

fun calculateTemperature(){
   //цикл
    var x=20
    while (x>18) {

    val temperatureString = readln()

         //Перевірка на ввід інту
    val temperatureInt: Int? = try {
        temperatureString.toInt()
    } catch (e: Exception) {
        println("ти ввів текст, уйобок, а не число ><")
        null
    }


    var temperatureState = ""

    temperatureInt?.let {

        //Пергий
        if (temperatureInt < 20) {
            temperatureState = "Температура низька"
        } else if (temperatureInt > 20) {
            temperatureState = "Температура висока"
        } else {
            temperatureState = "Температура нормальна"
        }
        println("First way $temperatureState")



        temperatureState = if (temperatureInt < 20) {
            "Температура низька"
        } else if (temperatureInt > 20) {
            "Температура висока"
        } else {
            "Температура нормальна"
        }
        println("Second way $temperatureState")




        temperatureState = when (temperatureInt) {
            in Int.MIN_VALUE..20 -> "Температура низька"
            in 20..Int.MAX_VALUE -> "Температура висока"
            else -> "Температура нормальна"
        }
        println("Third way $temperatureState")
    }
         x--

     }

}



