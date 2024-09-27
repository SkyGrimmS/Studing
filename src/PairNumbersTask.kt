fun main() {
    val numbers = listOf(2, 32, 35, 76, 234, 57, 45, 134, 64, 99)
    for (n in numbers.indices) {
        if (numbers[n] % 2 == 0){
            println(numbers[n])
        }
    }
}