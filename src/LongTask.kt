fun main() {
    println("Введіть свій вік")
    val age = readln().toLong()
    val seconds:Long = (((age*365)*24)*60)*60
    println(seconds)
}