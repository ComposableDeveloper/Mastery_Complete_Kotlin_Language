package Kotlin.Concept

//An enum class is used to define a fixed set of constants. Great for representing states, directions, ranks, etc.

enum class Direction{
    NORTH, SOUTH, WEST, EAST
}

fun describeDirection(direction: Direction){

    when(direction){
        Direction.NORTH -> println("Going to the North.")
        Direction.SOUTH -> println("Going to the South.")
        Direction.EAST -> println("Going to the East.")
        Direction.WEST -> println("Going to the West.")
    }

}

fun main(){
    val myNorth = Direction.NORTH
    val mySouth = Direction.SOUTH
    val myEast = Direction.EAST
    val myWest = Direction.WEST
    describeDirection(myNorth)
    describeDirection(mySouth)
    describeDirection(myEast)
    describeDirection(myWest)

}