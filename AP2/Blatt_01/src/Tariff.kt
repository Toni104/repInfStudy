
//Enum class welche die verschiedenen Wochentariffe zur Auswahl hat

enum class Tariff (val price: Double) {

    DEFAULT(1.99),
    EVENT(1.49),
    WEEKEND(2.99);

    // die Methode price gibt den Preis als double zurück
    fun price (): Double{
        return when(this){
            DEFAULT -> 1.99
            EVENT -> 1.49
            WEEKEND -> 2.99
        }
    }
}
