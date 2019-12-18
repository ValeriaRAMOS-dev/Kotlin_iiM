package plus_ou_moins

fun main(args: Array<String>) {

    println(" Vous, Joueur 1,  choisissez un nombre entre 1 et 100 :\n")
    val Joueur1 = readLine()!!.toInt()
    var Joueur2: Int
    var tentatives=0

    while (true) {
        print(" Maintenant à votre tour Joueur 2, essayez de deviner et entrez un nombre :")
        Joueur2 = readLine()!!.toInt()

        when(Joueur2.compareTo(Joueur1)) {
            -1 -> { println("Plus grand"); tentatives++ }
            0 -> { tentatives++; println("Bravo !!! Nombre de tentatives $tentatives"); return }
            1 -> { println("Plus petit"); tentatives++ }
        }
    }
}
