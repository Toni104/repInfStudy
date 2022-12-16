import java.lang.management.PlatformLoggingMXBean

class RunningTrack (val name : String, val distance : Int, val sights: List<String> = mutableListOf()) {



     override fun toString () ="Die Strecke im ${name} (${distance}) verlaeuft entlang ${sights}"


  }

       /*fun toStringe() {

        println("Die Strecke $name ($distance m) verlaeuft entlang ${sights[0]}, ${sights[1]}.")

    }*/

fun printAll (tracks: List<RunningTrack>){

    for (RunningTrack in tracks)
        println(RunningTrack)

// println(tracks.toString())
}

fun printMinMax (tracks: List<RunningTrack>, min: Int, max: Int){
    for (RunningTrack in tracks){
        if (RunningTrack.distance in min..max){
            println(RunningTrack)
        }
    }

}

fun printUntilDestinationLength(tracks: List<RunningTrack>, destinationLength : Int){

     var sumDistance = 0
    for(Runningtrack in tracks)
        { if (sumDistance < destinationLength){
       sumDistance += Runningtrack.distance

        }
    }

    val destinationLength = sumDistance
    println("Es wurden $destinationLength Meter zurueckgelegt.")
}

fun printUntilTrack(track: RunningTrack, tracks: List<RunningTrack>) {
   for(index in tracks){
       if(index != track)
           println(index)
       else
           break
   }

}
fun printShortestTrack(tracks: List<RunningTrack>){

    val smallest = tracks.minByOrNull { it -> it.distance }
    println(smallest)
}

fun printLongestTrack(tracks: List<RunningTrack>){
    val greatest = tracks.maxByOrNull { it -> it.distance }
    println(greatest)
}

fun sumLength(tracks: List<RunningTrack>) : Int {

    return tracks.sumOf{it.distance}
}

fun averageLength(tracks: List<RunningTrack>) : Int {

    return tracks.sumOf{it.distance} / tracks.size
}

/*fun hasPlaceOfInterest(tracks: List<RunningTrack>, placeOfInterest: String): Boolean {
    var bool = false


    for ( in tracks) {
        if (item.sights.equals(placeOfInterest)) {
            bool = true
            break
        }
    }
    return bool
}
*/
fun longestTrack(tracks: List<RunningTrack>): RunningTrack?{


    return tracks.maxByOrNull { it -> it.distance }
}

fun shortestTrack(tracks: List<RunningTrack>): RunningTrack?{
    return tracks.minByOrNull { it -> it.distance }
}

/*fun tracksWithPlaceOfInterest(tracks: List<RunningTrack>, placeOfInterest: String): List<RunningTrack>{

}*/

fun longestTrackOf (track1: RunningTrack, track2: RunningTrack): RunningTrack{
    if (track1.distance > track2.distance) {
        return track1
    }
        else if (track1.distance < track2.distance) {
        return track2
    }
        else  (track1.distance == track2.distance)

        return track1; track2

    }


fun main (){

    val track0 = RunningTrack ("Im Wald", 5000, listOf("Baumhaus", "Tiergehege"))
    val track1 = RunningTrack("Am See", 2000, listOf("Brücke"))
    val track2 = RunningTrack("In der Stadt", 3000, listOf("Tunnel"))
    val track3 = RunningTrack("Am Teich", 4000, listOf("Burg"))
    val track4 = RunningTrack("Auf der Insel", 5000, listOf("Wiese"))

    val tracks = mutableListOf<RunningTrack>(track0, track1, track2, track3, track4)

    /*printAll(tracks)
    printMinMax(tracks, 400, 2000)
    printUntilDestinationLength(tracks, 2000)
    printUntilTrack(track2, tracks)
    printShortestTrack(tracks)
    printLongestTrack(tracks)
    println (sumLength(tracks))
    println (averageLength(tracks)) */
   //println(hasPlaceOfInterest(tracks, "Burg"))
    println(longestTrackOf(track1, track4))
}


