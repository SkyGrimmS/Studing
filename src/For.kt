
fun main() {
    val names = listOf("Sun", "Moon", "Miki", "Siri", "Zoomi", "Teddy")
    print("Enter name: ")
    val inputName = readln()
    var nameFound = false

    for (name in names) {
        if(inputName == name){
            nameFound = true
            break
        }
    }

    println("Чи імя є в списку: $nameFound")
}

