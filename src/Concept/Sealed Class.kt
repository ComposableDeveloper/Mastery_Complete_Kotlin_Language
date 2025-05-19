package Concept

//A sealed class in Kotlin restricts class inheritance. All subclasses must be defined within the same file.


sealed class SealedClass

data class Attack(val name: String): SealedClass()
object Defend: SealedClass()
object Heal: SealedClass()


fun handleAction(action: SealedClass){
when(action){
    is Attack -> println("${action.name} is Attacking will all his life force.")
    Defend -> println("Susanoo is Defending himself.")
    Heal -> println("Hashirama Cells is Healing him.")
}
}

fun main(){
val attack = Attack("Madara Uchiha")
    val defend = Defend
    val heal = Heal
    attack.name
    handleAction(attack)
    handleAction(defend)
    handleAction(heal)
}