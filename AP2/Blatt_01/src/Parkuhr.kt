import jdk.javadoc.doclet.StandardDoclet
import javax.print.attribute.standard.PagesPerMinute
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler.DEFAULT
import kotlin.time.Duration


fun main() {
    /*  val time1 = Time(12, 0) //valide Uhrzeit
    val time2 = Time(12, 30) //valide Uhrzeit
    val time3 = Time(26, 120) //invalide Uhrzeit: Programm stürzt mit einer Fehlermeldung (Exception) ab.
    val time4 = Time(-5, -10) //invalide Uhrzeit: Programm stürzt mit einer Fehlermeldung (Exception) ab.
    val machine = TicketMachine ( Tariff.DEFAULT )
    val ticket1 = machine.generate(Time(12, 0))
    val ticket2 = machine.generate(Time(12,0))

    ticket1.checkout(Time(13,0))
    ticket2.checkout(Time(14, 0))
    println(machine.revenues())

    println(machine.shortestParkingDuration())
    println(machine.averageParkingDuration())
    //exitTime wird zunächst standardmäßig auf null gesetzt
    //funktioniert. Parkdauer beträgt 30min

    //ticket.checkout(Time(12, 0))//funktioniert nicht. Parkdauer kann nicht negativ sein. Program stürzt mit einer Fehlermeldung ab.
    //println(ticket2.parkingDuration())
 //   println("Die Parkzeit beträgt ${ticket.hoursStarted()}.")

*/


    val machine = TicketMachine ( Tariff . DEFAULT )
val ticket1 = machine . generate ( Time (12 , 0) )
val ticket2 = machine . generate ( Time (12 , 30) )
val ticket3 = machine . generate ( Time (13 , 30) )
val ticket4 = machine . generate ( Time (13 , 30) )
ticket1 . checkout ( Time (12 , 30) ) // 30 min (1h)
ticket2 . checkout ( Time (13 , 30) ) // 60 min (1h)
ticket3 . checkout ( Time (14 , 50) ) // 80 min (2h)
// ticket4 wird nicht abgestempelt und wird daher für alle folgenden Methodenaufrufe nicht berücksichtigt

println ( machine . shortestParkingDuration () ) // Gibt 30 aus
println ( machine . averageParkingDuration () ) // Gibt 56 aus ((30 + 60 + 80) / 3)

println ( machine . revenues () ) // Gibt 7.96 aus ((1 + 1 + 2) *
machine . tariff . price ()


}