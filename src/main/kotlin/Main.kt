fun main() {
    val lastOnlineSeconds = 3600 // Replace this with the actual seconds since last online
    val textRepresentation = agoToText(lastOnlineSeconds)
    println(textRepresentation)
}

fun agoToText(time: Int): String {
    return when {
        time <= 60 -> "был(а) только что"
        time <= 60 * 60 -> " назад"
        time <= 24 * 60 * 60 -> " назад"
        time <= 2 * 24 * 60 * 60 -> "вчера"
        time <= 3 * 24 * 60 * 60 -> "позавчера"
        else -> "давно"
    }
}
