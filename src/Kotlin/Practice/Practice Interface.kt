package Kotlin.Practice

interface AkatsukiPower {
    fun introduce()
}

class Itachi : AkatsukiPower {
    override fun introduce() {
        println("Itachi is unbeatable with his Tsukuyomi!")
    }
}

class Kisame : AkatsukiPower {
    override fun introduce() {
        println("Kisame is unbeatable with his Samehada slash!")
    }
}

class LegendaryShinobi(val name: String, val moves: String) : AkatsukiPower {
    override fun introduce() {
        println("$name is more powerful with $moves")
    }
}

fun main() {
    val itachi = Itachi()
    itachi.introduce()
    val kisame = Kisame()
    kisame.introduce()
    val legendaryShinobi = LegendaryShinobi("Orochimaru", "Eight Branches Technique")
    legendaryShinobi.introduce()
}