


object P2 {

  def almostLast[T](list: List[T]): T = list match {

    case e :: _ :: Nil          => e
    case _ :: tail              => almostLast(tail)
    case _                      => throw new NoSuchElementException
  }

}
