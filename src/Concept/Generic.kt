package Concept

//Generics let you write flexible and type-safe code that works with any type (like String, Int, CustomClass, etc.),
//without duplicating logic.

class Generic<T>(val value: T){
    //Here, T is a type parameter, meaning the scroll can store any type of data.
    fun content(): T{
        return value
    }


}
