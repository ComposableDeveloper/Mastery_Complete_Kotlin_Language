//package Kotlin.Concept
//
//import java.time.Duration
//import java.time.Year
//
////Constructor is special functions that are used to initialize the class.
//
////Primary Constructor: It declares at class header level... or you can say it parameter() for class which class don't have without a constructor.
//class Builder(val project: String, val salary: Double){
//
//    var project = String
//    var salary = Int
//
//    //Secondary Constructor: It declares at class body level... or you can say it parameter() for class which class have a constructor.
//
//   constructor( year: Int, duration: Int){
//        this.project = year
//        this.salary = duration
//        print("Hello $year,")
//        print("Hello $duration,")
//    }
//
//    fun printProjectDetails(){
//        println("Project Name: $project")
//        println("Salary: $salary")
//    }
//
//}
//
//fun main(){
//    val myProject = Builder("Leaning Tower of Piza", 10000.00)
//    myProject.printProjectDetails()
//    val instagram = Builder(2005, 4)
//    Builder("Buj Khalifa", 20000.00).printProjectDetails()
//    Builder("Statu of Liberty", 30000.00).printProjectDetails()
//}