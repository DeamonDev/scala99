object P5 {

  def reverse[T](list: List[T]): List[T] = list match {
    case e :: Nil           => List(e)
    case e :: tail          => reverse(tail) ::: List(e)
    case Nil                => throw new NoSuchElementException

  }
}
