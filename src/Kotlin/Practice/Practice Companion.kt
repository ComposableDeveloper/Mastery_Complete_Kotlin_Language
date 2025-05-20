package Kotlin.Practice

class RinneganUser{

    companion object{
        val listOfUser = arrayOf("Madara","Nagato", "Obito", "Sasuke", "Sage of Six Path")


        fun reveal(){
            println("The user list is: ${listOfUser.joinToString(", ")}")
        }
    }


}

fun main(){
    RinneganUser.reveal()
}