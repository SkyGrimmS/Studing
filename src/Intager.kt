fun main() {
    println("Скільки яблук було у Джона?")
    val sumApples = applesSum()
    println("John and Nick have $sumApples apples")

}

fun applesSum(): Int {
    val johnCountApples = inputCountJohnApples()
    val nickCountApples = calculateCountNickApples(x = johnCountApples)
    val sum = johnCountApples + nickCountApples
    return sum
}

fun inputCountJohnApples(): Int {
    return readln().toInt()
}

fun calculateCountNickApples(x: Int): Int = x * 5





