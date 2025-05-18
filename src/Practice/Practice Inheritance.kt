package Practice

open class JutsuUser(val name: String, val kekkeiGenkai: String){
      open fun useJutsu(){
        println("$name is powerful with $kekkeiGenkai")
    }
}

class FireStyleUser(name: String, kekkeiGenkai: String): JutsuUser( name, kekkeiGenkai){
 override fun useJutsu(){
     println("Is this Real....")
     println("$name has aweken his $kekkeiGenkai.")
 }
}

class WaterStyleUser(name: String, kekkeiGenkai: String): JutsuUser( name, kekkeiGenkai){
 override fun useJutsu(){
     println("$name is much powerful with $kekkeiGenkai.")
 }
}

fun main(){

    val madaraUchiha = FireStyleUser("Madara", "Ethernal Magekyo Sharingan")
    val tobiramaSenju = WaterStyleUser("Tobirama", "Flying Raijin")
    madaraUchiha.useJutsu()
    tobiramaSenju.useJutsu()
}