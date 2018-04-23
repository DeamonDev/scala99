object P3 {

  def reverse[T](list: List[T]): List[T] = list match {
    case e :: Nil            => List(e)
    case e :: tail           => reverse(tail) ::: List(e)
    case Nil                 => throw new NoSuchElementException
  }

  def lastNth[T](list: List[T], index: Int, counter: Int = 0): T = list match {
    case e :: tail if counter == index        => e
    case e :: tail                            => lastNth(tail, index, counter + 1)
    case Nil                                  => throw new NoSuchElementException

  }

}
