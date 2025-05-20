package Kotlin.Practice

data class Ninja(var name: String, var rank: String, var chakraLevel: Int)

fun main(){
    val kakashi = Ninja("Kakashi", "Ninja", 9)
    println(kakashi)

    val sasuke = Ninja("Sasuke", "Genin", 8)
    val stringSakura = sasuke.toString()
    println(stringSakura)

    val madara = Ninja("Madara", "Genin", 8)
    val copyMadara = madara.copy(rank = "Ghost")
    println(copyMadara)

    val obito = Ninja("Obito", "Shinobi", 7)
    if (obito == sasuke) println("obito is equal to sasuke")
    else if (obito == madara) println("They are the same ninja.")
    else println("This brat are never compare to me.")

    val naruto = Ninja("Naruto", "Hunter", 5)
    val (name, rank, chakra) = naruto
    println(
        """
            $name is a $rank ninja with a $chakra chakra level.
        """.trimIndent()
    )




}