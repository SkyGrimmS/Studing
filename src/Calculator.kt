fun main() {
    println("Введіть перше число")
    val firstNumber = readln().toDouble()

    println("Вибріть дію")
    val operator = readln()

    println("Введіть друге число")
    val secondNumber = readln().toDouble()


    /* val actionResult = if (operator == "-") {
        firstNumber - secondNumber
    } else if (operator == "+") {
        firstNumber + secondNumber
    } else if (operator == "/") {
        firstNumber / secondNumber
    }else{
        firstNumber * secondNumber
    }*/

    val actionResult =  when (operator) {
        "-" -> firstNumber - secondNumber
        "+" -> firstNumber + secondNumber
        "*" -> firstNumber * secondNumber
        else -> firstNumber / secondNumber
    }


    println("Результат: $actionResult")
}