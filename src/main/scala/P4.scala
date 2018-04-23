object P4 {

  def lengthOfList[T](list: List[T]): Int = list match {
    case Nil            => 0
    case e :: tail      => 1 + lengthOfList(tail)
  }
}
