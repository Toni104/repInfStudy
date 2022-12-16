fun main () {

        /*  val list = LinkedList <String >()
    println ( list . isEmpty () ) // true
    list . addFirst (" Apfel ")
    list . addFirst (" Banane ")
    list . addFirst (" Birne ")
    println ( list . isEmpty () ) // false
    println ( list . getFirst () ) // " Birne "
    println ( list.size())//3
    list . clear ()
    println ( list . getFirst () ) // null
    println ( list . isEmpty () ) // true
    println ( list.size())//0

    */

        /*   val list = LinkedList <String >()
        println ( list . size () ) // 0
        list . addFirst (" Apfel ")
        list . addFirst (" Banane ")
        list . addFirst (" Birne ")
        println ( list . size () ) // 3
        println ( list . getOrNull (0) ) // Birne
        println ( list . getOrNull (1) ) // Banane
        println ( list . getOrNull (2) ) // Apfel
        println ( list . getOrNull (3) ) // null
        list . addLast (" Pfirsich ")
        println ( list . getOrNull (3) ) // Pfirsich
        println ( list . getOrNull (4) ) // null
*/


     /*   val list = LinkedList<String>()
        list.addFirst(" Apfel ")
        list.addFirst(" Banane ")
        list.addFirst(" Birne ")
        list.forEach { element ->
                println(element)
        }*/

        val list = LinkedList <String >()
        list . addFirst ("Apfel")
        list . addFirst ("Banane")
        list . addFirst ("Birne")
        val fruitsStartWithB = list . countWhere { element ->
                element . startsWith ("B")
        }
        println ( fruitsStartWithB ) // 2
}