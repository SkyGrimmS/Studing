fun main() {

    val rate = inputRate()
    val comments = inputComments()

    println("Thx for your rate! \nYour appraisal: $rate \nYour approve: $comments")

}

fun inputRate():String {
    val rateReqestText = "Please enter your rate for us:"
    println(rateReqestText)
    val rateRequest:String = readln()
    return rateRequest

}


fun inputComments():String {
    val commentsReqestText = "Please enter your comment:"
    println(commentsReqestText)
    val commentsRequest:String = readln()
    return commentsRequest
}

