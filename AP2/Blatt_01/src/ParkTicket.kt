
//Klasse erstellt ein ParkTicket mit EntryTime


//Wann genau benutzt man "this"? Merkmale um Verwendung zu erkennen?!
class ParkTicket(val entryTime : Time){

    //solange noch keine ExitTime gegeben ist wird diese auf "null" gesetzt
    var exitTime: Time? = null

    //Methode prüft ob die ExitTime korrekt eingegeben ist, falls nicht NullPointerException!
    fun checkout (exitTime: Time){
        if (exitTime.hour > this.entryTime.hour || exitTime.hour == this.entryTime.hour && exitTime.minute > entryTime.minute) {
            this?.exitTime = exitTime
        } else {
            throw NullPointerException("Exit-time ungültig!")
        }
    }

    // Methode kalkuliert die Dauer des Parkens, und gibt diese zurück
    fun parkingDuration(): Int {
        var duration = exitTime!!.hour * 60 - entryTime.hour * 60 + ( exitTime!!.minute - entryTime.minute )


        return duration
    }
    val parkingDuration: Int
    //getter Methode für die Parkdauer
        get() {
            var duration = exitTime!!.hour * 60 - entryTime.hour * 60 + (exitTime!!.minute - entryTime.minute)


            return duration
        }

//Methode kalkuliert die Zeit ab der angestempelt wurde, somit werden auch angebrochene Stunden welche nicht abgestempelt wurden dazu gezählt

    fun hoursStarted(): Int {
        var durationInHours = exitTime!!.hour - entryTime.hour
        if(exitTime!!.minute == entryTime.minute)
            return durationInHours
        else {
            return durationInHours + 1
        }
    }
//get Methode zur Berechnung der angebrochenen Stunden
    val hoursStarted : Int
        get()
        {
            var durationInHours = exitTime!!.hour - entryTime.hour
            if (exitTime!!.minute == entryTime.minute)
                return durationInHours
            else {
                return durationInHours + 1
            }
        }


}