fun main() {
    val lastOnlineMillis = 100

    val result = agoToText(lastOnlineMillis)
    println(result)
}

fun agoToText(lastOnlineMillis: Int): String {
    val nowMillis = System.currentTimeMillis().toInt()
    val secondsAgo = (nowMillis - lastOnlineMillis) / 1000

    return when {
        secondsAgo <= 60 -> "был(а) только что"
        secondsAgo <= 60 * 60 -> minutesAgo(secondsAgo)
        secondsAgo <= 24 * 60 * 60 -> hoursAgo(secondsAgo)
        secondsAgo <= 2 * 24 * 60 * 60 -> "вчера"
        secondsAgo <= 3 * 24 * 60 * 60 -> "позавчера"
        else -> "давно"
    }
}

fun minutesAgo(secondsAgo: Int): String {
    val minutes = secondsAgo / 60
    return if ((minutes == 1 || minutes == 21) ||
        (minutes in 2..4 || minutes in 22..24) ||
        (minutes in 5..20 || minutes in 25..60)
    ) {
        "$minutes минут${if (minutes == 1 || minutes == 21) "у" else ""} назад"
    } else {
        "$minutes минут назад"
    }
}

fun hoursAgo(secondsAgo: Int): String {
    val hours = secondsAgo / 3600
    return if ((hours == 1 || hours == 21) ||
        (hours in 2..4 || hours in 22..24) ||
        (hours in 5..20 || hours in 25..60)
    ) {
        "$hours час${if (hours == 1 || hours == 21) "" else "а"} назад"
    } else {
        "$hours часов назад"
    }
}
