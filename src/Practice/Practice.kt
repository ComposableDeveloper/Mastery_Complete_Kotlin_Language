package Practice


//Question 1
//class Clan(val name: String, val village: String, val memberCount: Int){
//    fun introduce(){
//        println("We are $name Clan of $village, and we have $memberCount members")
//    }
//}
//
//fun main(){
//    val senju = Clan("Senju", "Konohagakure", 400)
//    val uchiha = Clan("Uchiha", "Hidden Leaf", 300)
//    val hyuga = Clan("Hyuga", "Konohagakure", 200)
//    senju.introduce()
//    uchiha.introduce()
//    hyuga.introduce()
//}




//Question 2
class Akatsuki(val groupName: String){
    class Cloak {
        fun describe() {
            println("Akatsuki cloak is iconic.")
        }
    }
        inner class Member(val name: String)  {
            fun introduce(){
                println("Hi, I'm $name. I'm a member of $groupName.")
            }
        }
    }

fun main(){
    val akatsuki = Akatsuki("Akatsuki")
    val cloak = Akatsuki.Cloak()
    cloak.describe()

    val member = akatsuki.Member("Oruchimaru")
member.introduce()
    val anothermember = akatsuki.Member("Deddra")
    anothermember.introduce()
}