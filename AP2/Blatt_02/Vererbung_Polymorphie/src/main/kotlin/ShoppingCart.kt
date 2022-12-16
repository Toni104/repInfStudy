class ShoppingCart (){

    var produkte = mutableListOf<Product>()

    fun add(product : Product) : Product{

        produkte.add(product)

        return product

    }

    fun totalPrice() : Double{

        val price = produkte.sumOf{it.salesPrice()}

        return price


    }

    fun hasFreeShipping() : Boolean{
        return totalPrice() >= 30
    }

    fun getProductByName(productName: String) : Product?{
    for (produkt in produkte) {
        if (productName == produkt.name) {
            return produkt
        }
    }
        return null

    }

    fun reviewTextForProduct (productname: String) : String{
        var produkt = getProductByName(productname)
        var result = ""
        if (produkt != null) {
            for (bewertung in produkt.bewertungen) {
            result += bewertung.infoText() + "\n"
            }
        }
        return result
    }

    fun removeProductsBelowReviewScore(score: Int){


        // removeFunction?? Iteration??
        var average = 0.0
        var sumOfScore = 0.0
        var liste = mutableListOf<Product>()

       for (produkt in produkte){
           for (score in produkt.bewertungen)
               sumOfScore += score.score()
           average = sumOfScore / produkt.bewertungen.size
           if (average > score){
               liste.add(produkt)
           }
        }
        produkte = liste
    }

    fun savedMoney() : Double{
         //TypeCast

    var discount = 0.0

    for (produkt in produkte){
        if (produkt is DiscountedProduct){
            discount += produkt.moneySaved() }
        }

    return discount
    }

    fun show() : Unit{
        println("Gesamt  ${String.format("%.2f", totalPrice())}" + " " + savedMoney() + "\n")
        for (produkt in produkte){
            println(produkt.toString())
        }

    }






}