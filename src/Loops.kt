

fun main() {
    val names = listOf("Sun", "Moon", "Miki", "Siri", "Zoomi", "Teddy")
    print("Enter name: ")
    val inputName = readln()
    var nameFound = false
    var index = 0

    while (index<names.size || !nameFound) {
        if(inputName == names[index]){
            nameFound = true
        }
        index++
    }
    println("Чи імя є в списку: $nameFound")
}

