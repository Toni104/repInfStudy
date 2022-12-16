


interface Review {

    fun score(): Int
    fun infoText(): String

}

class StarReview (var score : Int): Review {

    override fun score(): Int {

        if (this.score < 0) return 0

        else if (this.score > 5) return 5

            else return this.score

    }

    override fun infoText(): String {
        if (score () == 0)
            return "Schlechtes Produkt (0/5)"
        else if (score () == 1)
            return "Minderwertiges Produkt (1/5)"
        else if (score () == 2)
            return "Unterdurchschnittliches Produkt (2/5)"
        else if (score () == 3)
            return "Brauchbares Produkt (3/5)"
        else if (score () == 4)
            return "Ueberdurchschnittliches Produkt (4/5)"
        else (score () == 5)
            return "Super Produkt (5/5)"
    }
}



class ThumbBasedReview(val daumen : Boolean): Review {
    override fun score(): Int {
        if (daumen)
            return 5
        else
            return 0
    }


    override fun infoText(): String = if (daumen) "Daumen hoch" else "Daumen runter"


}
