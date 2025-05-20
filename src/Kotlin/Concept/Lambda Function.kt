package Kotlin.Concept

//Lambda: A lambda is an anonymous function (a function without a name). It can be passed around.


val greekMe = {println("Hello Ankit")}
val sumThis = { a: Int , b: Int -> a + b}

fun main(){
    greekMe()
    println(sumThis(10,20))
    println(result)
}


//Higher Order Function: A function that Takes another function as a parameter OR Returns a function
//Think of it like summoning jutsu — calling another jutsu within a jutsu.

fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

val result = operate(10, 5) { x, y -> x * y }
  // Output: 50
