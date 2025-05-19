package Concept

//An interface defines functions (and optionally properties) that any class can implement.

interface Interface{
    fun introduce() {

        println("say Hello")

    }
}


//Implementaion in any class
class Implementation: Interface{
    override fun introduce() {
        println("I'm an implementation")
    }
}

fun main(){

    //calling here by ClassName
    val myImplementation = Implementation()
    myImplementation.introduce()
}