fun main () {

        val book = Product (" Buch ", 9.99 , 30)
        println ( book . salesPrice () ) // 12.987
        println ( book . toString () ) // Buch für 12 ,99 Euro
        val ball = Product (" Ball ", 4.99 , 100)
        println ( ball . salesPrice () ) // 9.98
        println ( ball . toString () ) // Ball für 9 ,98 Euro
        val candy = DiscountedProduct ("Süß igkeiten ", 1.99 , 30 , 20)
        println ( candy . salesPrice () ) // 2.0696000000000003
        println ( candy . moneySaved () ) // 0.5173999999999999
        println ( candy . toString () ) // Süß igkeiten für 2 ,07 Euro (0 ,52 Euro gespart )
        val phone = RefurbishedProduct (" Handy ", 299.99 , 20 , 20 , Quality . USED )
        println ( phone . salesPrice () ) // 287.9904
        println ( phone . moneySaved () ) // 71.99759999999999
        println ( phone . toString () ) // Handy für 287 ,99 Euro (72 ,00 Euro gespart) ( Gebraucht )
        val picture = LimitedProduct (" Bild ", 49.99 , 150 , 10)
        println ( picture . salesPrice () ) // 237.45250000000001
        println ( picture . toString () ) // Bild für 237 ,45 Euro ( nur 10 Exemplare verfügbar )


        val cart = ShoppingCart ()
        cart . add( Product (" Buch ", 9.99 , 30) )
        cart . add( Product (" Ball ", 4.99 , 100) )
        cart . add( DiscountedProduct ("Süßigkeiten ", 1.99 , 30 , 20) )
        cart . add( RefurbishedProduct (" Handy ", 299.99 , 20 , 20 , Quality . USED ))
        cart . add( LimitedProduct (" Bild ", 49.99 , 150 , 10) )
        cart . show ()

      //    val book = Product (" Buch ", 9.99 , 30)
                book . addReview ( StarReview (5) )
                book . addReview (ThumbBasedReview( false ))
              //  val picture = LimitedProduct (" Bild ", 49.99 , 150 , 10)
                picture . addReview ( ThumbBasedReview ( true ))



println ( book . salesPrice() ) // 12.987
println ( book . toString() ) // Buch für 12,99 Euro
//val ball = Product ("Ball", 4.99 , 100)
println ( ball . salesPrice() ) // 9.98
println ( ball . toString() ) // Ball für 9 ,98 Euro
//val candy = DiscountedProduct ("Süßigkeiten", 1.99 , 30 , 20)
println ( candy . salesPrice() ) // 2.0696000000000003
println ( candy . moneySaved() ) // 0.5173999999999999
println ( candy . toString() ) // Süßigkeiten für 2,07 Euro (0,52 Euro gespart )
//val phone = RefurbishedProduct ("Handy", 299.99 , 20 , 20 , Quality.USED )
println ( phone . salesPrice() ) // 287.9904
println ( phone . moneySaved() ) // 71.99759999999999
println ( phone . toString() ) // Handy für 287,99 Euro (72 ,00 Euro gespart ) ( Gebraucht )
//val picture = LimitedProduct ("Bild", 49.99 , 150 , 10)
println ( picture . salesPrice() ) // 237.45250000000001
println ( picture . toString() ) // Bild für 237,45 Euro (nur 10 Exemplare verfügbar)

}

/*

        val book = Product("Buch", 9.99, 30)
        val stone = Product("Stein", 1.0, 10)
        val keyboard = DiscountedProduct("Tastatur", 20.0, 20, 40)
        val mouse = RefurbishedProduct("Maus", 5.0, 20, 40, Quality.BAD)
        val cart = ShoppingCart()
// cart.add(Product("Buch2", 1.0, 10))
// cart.add(Product("Buch3", 1.0, 100))
        cart.add(book)
        cart.add(stone)
        cart.add(keyboard)
//  cart.add(mouse)

        println(cart.savedMoney())
        keyboard.addReview(StarReview(4))
        keyboard.addReview(StarReview(5))

        stone.addReview(StarReview(5))
        stone.addReview(ThumpBasedReview(false))
        stone.addReview(StarReview(1))

//println(cart.totalPrice())
//  println(cart.hasFreeShipping())
        book.addReview(StarReview(5))
        stone.addReview(StarReview(1))
        book.addReview(ThumpBasedReview(false))
//    println(book.bewertungen[1].infoText())
//   println(cart.reviewTextForProduct("Buch"))
        println(cart.reviewTextForProduct("Stein"))
        println(cart.produkte)
// cart.removeProductsBelowReviewScore(4)
        println(cart.produkte)
//   println(cart.produkte[0])

        cart.show()

}

*/