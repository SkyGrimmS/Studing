fun main(){
    val profileFirstName = inputFirstName()
    val profileSecondName = inputSecondName()
    val profileAge = inputAge()

    println("User: $profileFirstName $profileSecondName \nAge: $profileAge")

}


fun inputFirstName(): String {
    val askingFirstName = "Enter your Firstname: "
    println(askingFirstName)
    val firstName:String = readln()
    return firstName
}

fun inputSecondName(): String {
    val askingSecondName = "Enter your Secondname: "
    println(askingSecondName)
    val secondName:String = readln()
    return secondName
}

fun inputAge(): String {
    val askingAge = "Enter your Age: "
    println(askingAge)
    val age: String = readln()
    return age
}
