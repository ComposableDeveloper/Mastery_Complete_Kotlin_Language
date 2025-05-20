package Kotlin.Concept

//Collection is used to organize things up...
//It is a group of objects that can be grouped in various ways.

//1. List – An ordered collection (duplicates allowed)
//val akatsuki = listOf("Itachi", "Kisame", "Deidara")
//println(akatsuki[0]) // Output: Itachi
//Use mutableListOf() for a changeable list

//2. Set – Unique members only (no duplicates)
//val kages = setOf("Hashirama", "Tobirama", "Minato", "Hashirama")
//println(kages) // Output: Only one "Hashirama"

//3. Map – Key-value pairs (like a scroll of ninja info)
//val ninjaMap = mapOf(
//    "Madara" to "Ghost of the Uchiha",
//    "Hashirama" to "God of Shinobi"
//)
//println(ninjaMap["Madara"])

fun main(){
    val akatsuki = listOf("Itachi", "Kisame", "Deidara", "Orochimaru")
    println(akatsuki.joinToString(", ")) // Output: Itachi
    val kages = setOf("Hashirama", "Tobirama", "Minato", "Hashirama")
    println(kages) // Output: Only one "Hashirama"

val ninjaMap = mapOf(
    "Madara" to "Ghost of the Uchiha",
    "Hashirama" to "God of Shinobi"
)
println(ninjaMap["Madara"])
println(ninjaMap["Hashirama"])

}