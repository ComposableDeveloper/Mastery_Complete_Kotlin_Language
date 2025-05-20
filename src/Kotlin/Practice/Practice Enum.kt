package Kotlin.Practice

enum class AkatsukiMember(val rank: String, val speciality: String) {
    Itachi("S-Rank", "Mangekyo Sharingan"),
    Hidan("A-Rank", "Immortality Ritual"),
    Deidara("S-Rank", "Explosive Clay"),
    Konan("S-Rank", "Paper Ninjutsu"),
    Orochimaru("S-Rank", "Forbidden Jutsu"),
    Zetsu("A-Rank", "Spy Techniques"),
    Kisame("S-Rank", "Water Jutsu"),
    Sasori("S-Rank", "Puppet Mastery"),
    Kakuzu("S-Rank", "Heart Theft"),
    Nagato("S-Rank", "Rinnegan"),
    Obito("S-Rank", "Kamui"),
    Pain("S-Rank", "Six Paths"),
    Sasuke("S-Rank", "Chidori Variants")
}

fun describeMember(member: AkatsukiMember) {
    when (member) {
        AkatsukiMember.Itachi -> println("Itachi Uchiha: The ${member.rank} shinobi and the Master of the ${member.speciality}.")
        AkatsukiMember.Hidan -> println("Hidan: The ${member.rank} shinobi with the ${member.speciality}.")
        AkatsukiMember.Deidara -> println("Deidara: The ${member.rank} shinobi with the ${member.speciality}.")
        AkatsukiMember.Konan -> println("Konan: The ${member.rank} shinobi with the ${member.speciality}.")
        AkatsukiMember.Orochimaru -> println("Orochimaru: The ${member.rank} shinobi with the ${member.speciality}.")
        AkatsukiMember.Zetsu -> println("Zetsu: The ${member.rank} shinobi with the ${member.speciality}.")
        AkatsukiMember.Kisame -> println("Kisame: The ${member.rank} shinobi with the ${member.speciality}.")
        AkatsukiMember.Sasori -> println("Sasori: The ${member.rank} shinobi with the ${member.speciality}.")
        AkatsukiMember.Kakuzu -> println("Kakuzu: The ${member.rank} shinobi with the ${member.speciality}.")
        AkatsukiMember.Nagato -> println("Nagato: The ${member.rank} shinobi with the ${member.speciality}.")
        AkatsukiMember.Obito -> println("Obito: The ${member.rank} shinobi with the ${member.speciality}.")
        AkatsukiMember.Pain -> println("Pain: The ${member.rank} shinobi with the ${member.speciality}.")
        AkatsukiMember.Sasuke -> println("Sasuke: The ${member.rank} shinobi with the ${member.speciality}.")
    }
}

fun main() {
    val memberItachi = AkatsukiMember.Itachi
    describeMember(memberItachi)

    val memberHidan = AkatsukiMember.Hidan
    describeMember(memberHidan)

    val memberDeidara = AkatsukiMember.Deidara
    describeMember(memberDeidara)

    val memberKonan = AkatsukiMember.Konan
    describeMember(memberKonan)

    val memberOrochimaru = AkatsukiMember.Orochimaru
    describeMember(memberOrochimaru)

    val memberZetsu = AkatsukiMember.Zetsu
    describeMember(memberZetsu)

    val memberKisame = AkatsukiMember.Kisame
    describeMember(memberKisame)

    val memberSasori = AkatsukiMember.Sasori
    describeMember(memberSasori)

    val memberKakuzu = AkatsukiMember.Kakuzu
    describeMember(memberKakuzu)

    val memberNagato = AkatsukiMember.Nagato
    describeMember(memberNagato)

    val memberObito = AkatsukiMember.Obito
    describeMember(memberObito)

    val memberPain = AkatsukiMember.Pain
    describeMember(memberPain)

    val memberSasuke = AkatsukiMember.Sasuke
    describeMember(memberSasuke)
}