import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TreeTest {
    @Test
    fun testIsEmpty()
    {
        val tree = emptyTree<Int>()
        assertEquals(true, tree.isEmpty())
    }
    @Test
    fun testSize (){

       var testNode = treeNode(4, treeNode(7)) // zwei wird erwartet, da zwei Knoten
        assertEquals(2, testNode.size())

    }
    @Test
    fun testDepth () {
        var testNode = treeNode(4, treeNode(7, treeNode(8))) // zwei wird erwartet
        println(testNode)
        assertEquals(2, testNode.depth())
    }
    @Test
    fun testMap (){

        var testNode = treeNode(4, treeNode(7, treeNode(8))) // zwei wird erwartet
        testNode.map { it + 2}
        println("$testNode")
        assertEquals(2, testNode.depth())
        assertEquals(3, testNode.size())

    }

    @Test
    fun testAdd (){
        val compare2 = { a: Int, b: Int -> a.compareTo(b) }
        var tree2 = treeNode(4)
     //   println("$tree2")
        assertEquals(1, tree2.size())
        tree2 = tree2.add(5, compare2)
        tree2 = tree2.add(3, compare2)
        tree2 = tree2.add(8, compare2)
        tree2 = tree2.add(4, compare2)
      //  println("Das hier ist der Baum $tree2")
        assertEquals(2, tree2.depth())
        assertEquals(5, tree2.size())



    }
}
