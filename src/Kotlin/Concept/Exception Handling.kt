package Kotlin.Concept

//Exception handling is a way to manage unexpected errors during program execution
// — like a crash or a failed mission
//In Kotlin, we use:
//try
//catch
//finally
//and throw
//To catch, handle, and optionally rethrow errors.

fun main() {
    try {
        val result = 10 / 0  // This will throw an ArithmeticException
        println("Result: $result")
    } catch (e: ArithmeticException) {
        println("Caught an error: ${e.message}")
    } finally {
        println("No matter what, I'm still standing...")
    }

    try {
        throwIfWeak(50)
    } catch (e: IllegalArgumentException) {
        println("Mission failed: ${e.message}")
    }

}


fun throwIfWeak(chakra: Int) {
    if (chakra < 100) throw IllegalArgumentException("Your chakra is too weak!")
    println("You're ready for battle.")
}

