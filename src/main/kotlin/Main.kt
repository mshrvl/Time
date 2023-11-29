fun main() {
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

fun wordInTime() {}