object P1 {

  def last[T](list: List[T]): T = list match {

    case e :: Nil       => e
    case _ :: tail      => last(tail)
    case _              => throw new NoSuchElementException
  }

}
