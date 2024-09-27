fun main() {
    var x = 10
    while (x > 1) {
        val isMoneyEnough = checkIfMoneyEnough()

        println("Чи голодні ви? true/false")
        val isFamineState = readln().toBoolean()

        val currentTask = if (!isFamineState && isMoneyEnough) {
            "Сходіть в кіно"
        } else if (isFamineState && !isMoneyEnough) {
            "Купіть мівіну!"
        } else if (isFamineState) {
            "Замовте суші"
        } else {
            "Сходіть прогулятися"
        }
        println(currentTask)
        x--

    }
}


    fun checkIfMoneyEnough(): Boolean {
        println("Скільки у вас грошей?")
        val moneyInput = readln().toInt()
        return moneyInput >= 500
    }


