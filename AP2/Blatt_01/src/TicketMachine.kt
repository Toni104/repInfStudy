
// diese Klasse erzeugt ein Ticket und fügt dieses der Liste "ticketList" hinzu
// der Tariff wird der Klasse übergeben damit dieser an das entsprechende Ticket gehangen werden kann

class TicketMachine (var tariff : Tariff) {
//private list, da diese nur in der Klasse TicketMachine verwendet wird

    private val ticketList: MutableList<ParkTicket> = mutableListOf()

    //hier wird ein Ticket erstellt, jedoch nur mit der EntryTime, somit ist das Ticket noch nicht valide bzw vollständig
    fun generate(entryTime: Time): ParkTicket {
        val ticket = ParkTicket(entryTime)
        ticketList.add(ticket)

        return ticket
    }
// private Methode, da diese nur in dieser Klasse verwendet wird
    //überprüft ob das ticket valide und somit eine gültige Exittime besitzt, dieses Ticket wird zurückgegeben

    private fun validTickets(): MutableList<ParkTicket> {
        val valide = mutableListOf<ParkTicket>()

        for (ticket in ticketList) {
            if (ticket.exitTime != null) {
                valide.add(ticket)
            }
        }

        return valide
    }
//berechnet die kürzeste Parkdauer aller vorhandenen, validen Tickets und gibt diese zurück
    fun shortestParkingDuration(): Int {

        val duration = validTickets().minOf { it.parkingDuration }

        return duration
    }
//berechnet die durchschnittliche Parkdauer aller validen Tickets und gibt diese zurück
    fun averageParkingDuration(): Int {
        val averageDuration = validTickets().sumOf { it.parkingDuration } / validTickets().size

        return averageDuration
    }

//berechnet die Einnahmen aller validen Tickets, mithilfe der hoursStarded Methode und gibt diese als double zurück
    fun revenues(): Double {
        var allRevenues = 0.0
        for (ticket in validTickets()){
            allRevenues += ticket.hoursStarted * this.tariff.price()
        }
        return allRevenues
    }
}