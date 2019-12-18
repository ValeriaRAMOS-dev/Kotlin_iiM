package animalerie

class Animalerie {
    var list = mutableListOf<animal>()

    fun ajouteranimal(moyen: animal){
        list.add(moyen)
    }
}
