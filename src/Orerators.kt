// З функції мейн викликаємо функцію і задаємо їй якесь число, якщо число буде більше за 10 то потрібно до нього додати ще 20 і вивести цей результат (не в мейн).
// Якщо воно менше 10ти - розділити його на самого себе і додати 300. і повернути результат у функцію мейн.
fun main() {
    println("Введіть своє число: ")
    val inputUserNumber = readln().toInt()

    if (inputUserNumber > 10) {
        numberCheckMoreTen(inputUserNumber)
    } else {
        val resultLessTen = numberCheckLessTen(inputUserNumber)
        println(resultLessTen)
    }
}


    fun numberCheckMoreTen(checkNumber: Int) {
        val moreTen = checkNumber + 20
        println(moreTen)
    }


    fun numberCheckLessTen(checkNumber: Int): Int {
        return checkNumber + 300
    }