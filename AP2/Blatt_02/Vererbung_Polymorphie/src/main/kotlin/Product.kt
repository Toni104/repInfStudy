open class Product (val name : String , val basePrice : Double , val margin : Int){

     var bewertungen = mutableListOf<Review>()

  open fun salesPrice () : Double = basePrice + (basePrice * (0.01 * margin))

  override fun toString() : String = "$name fuer ${salesPrice()}"

  open fun addReview (currentReview: Review){

      bewertungen.add(currentReview)

    }

}
open class DiscountedProduct (name : String , basePrice : Double , margin : Int, val discount : Int ): Product (name, basePrice, margin) {

  override fun salesPrice () : Double {


       //Rabatt wird vom Gesamtpreis incl. Marge abgezogen

      var price = basePrice + (basePrice * (0.01 * margin))
       //Rabattabzug
       price -= (price * discount) / 100

       return price
   }

   open fun moneySaved () : Double {
       var price = basePrice + (basePrice * (0.01 * margin))

       var rabatt = price * discount / 100

       return rabatt
   }


    override fun toString() : String = "${super.toString()}" + "(${moneySaved()} gespart)"

    override fun addReview(currentReview: Review) = super.addReview(currentReview)
    }




enum class Quality {
    GOOD , USED , BAD
}
class RefurbishedProduct (name : String , basePrice : Double , margin : Int , discount : Int, val quality : Quality) : DiscountedProduct (name, basePrice, margin, discount){
    override fun salesPrice () : Double = super.salesPrice()

    override fun moneySaved () : Double = super.moneySaved()

    override fun toString() : String = "${super.toString()}" + " ($quality)"
}

class LimitedProduct (name : String, basePrice : Double, margin : Int, val totalNumberOfProducts : Int) : Product (name, basePrice, margin) {
    override fun salesPrice () : Double = super.salesPrice() * (1 + ((100 - totalNumberOfProducts) * 0.01))

    override fun toString(): String = "${super.toString()}" + "(nur $totalNumberOfProducts verfuegbar)"

  //  Aufschlag in Prozent = 100 - totalNumberOfProducts.
    }

