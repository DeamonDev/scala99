object P7 {

  def flatten(list: List[Any]): List[Any] = list flatMap {
    case ls: List[_]            => flatten(ls)
    case e                      => List(e)
  }

}
