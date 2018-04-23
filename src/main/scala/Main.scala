


object Main extends App {
  println("Hello sbt!")

  val myList: List[Int] = List(1,3,10, -17)
  println(P1.last(myList))
  println(P2.almostLast(myList))
  println(P3.reverse(myList))
  println(P3.lastNth(myList, 2))
  println(P3.lastNth(P3.reverse(myList), 2))
}