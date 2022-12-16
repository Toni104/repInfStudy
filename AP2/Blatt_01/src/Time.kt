


//diese Klass erstellt die Uhrzeit (EntryTime , ExitTime)
class Time(val hour : Int, val minute : Int) {


    //  override fun toString(): String = "Die Uhrzeit ist ${hour}:${minute}."
//in diesem init-Block wird festgelegt, welche Werte für hour und minute angenommen werden dürfen, andernfalls Exception!
    init {
        if (hour < 0 || minute < 0 || hour > 24 || hour > 59) throw Exception("No valid Time!-")

    }
}