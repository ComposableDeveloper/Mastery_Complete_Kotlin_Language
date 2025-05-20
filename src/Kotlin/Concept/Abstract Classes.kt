package Kotlin.Concept

//An abstract class in Kotlin is a special kind of class that acts like a template for other classes,
// but can't be used to create objects directly
// It can have Rule and share code

abstract class AbstractClass(val name: String){
    abstract fun introduce()
    fun printName(){
       println("Name: $name")
    }
}

class ConcreteClass (name: String): AbstractClass(name){
    override fun introduce(){
        println("Hi, I'm $name")
    }
}

fun main(){
    val myClass = ConcreteClass("Abstract Class")
    myClass.introduce()
    myClass.printName()
}
