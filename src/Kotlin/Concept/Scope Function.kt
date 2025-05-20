package Kotlin.Concept

import kotlin.apply

//Scope functions in Kotlin are a set of higher-order functions that allow
//executing a block of code within the context of an object.

//This have many scope function
//1.let
//Executes the code block only if the object is not null (often used with null safety).
//Returns the last expression of the block.

//2.apply
//Apply is used to configure an object (like setting properties) and returns the object itself. Inside the block
class MyPowers(
    var hero: String = "",
    var moves: String = "",
){
    fun truePower(){

        println("True power of $hero is $moves")
    }
}

//3.with
//with is used when you already have a non-null object and want to perform multiple operations
// on it using this as the reference.

//4.run
//Calls a block of code on an object and returns the last expression.
//Often used for object configuration or running functions with return values.

//5.also
//also is used when you want to perform additional actions without changing the object.
// It returns the object, and inside the block, it refers to the object.

data class Language(val language: String)


fun main(){
    var name : String? = "Madara"
    name?.let { println("$it is the powerful.") }
//it keyword is
val scroll = "Forbidden Scroll"
    val result = scroll.run {
        println("opening $this...")
        this.uppercase()
    }

    val applyUse = MyPowers().apply {
        hero = "Madara"
        moves = "Ethernal Magekyo Sharingan"
    }

    applyUse.truePower()

val kotlin = Language("Kotlin").also { println("I'm Currently learning ${it.language }") }
println("Confirmed Language: ${kotlin.language}")
}

