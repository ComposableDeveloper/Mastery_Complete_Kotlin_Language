package Concept

//a companion object allows you to define functions and properties
// that belong to a class itself, not to instances of it.


class School{
    companion object{
        val standard = "Class 12"
        fun studingIn(){
            println("I'm studying in $standard.")
        }
    }
}

fun main(){
    School.studingIn()
}