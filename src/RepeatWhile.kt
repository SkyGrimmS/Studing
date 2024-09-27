import kotlin.random.Random

fun main() {
    val correctNumber = Random.nextInt(15)
    print("Вгадайте число від 1 до 15:")
    var userInputNumber = 0

    while(userInputNumber != correctNumber) {
        userInputNumber = readln().toInt()
        if (userInputNumber < correctNumber) {
            println("Ваше число менше")
        } else if (userInputNumber > correctNumber) {
            println("Ваше число більше")
        } else {
            println("Вітаю, ви вгадали!!!!")
        }
    }
}