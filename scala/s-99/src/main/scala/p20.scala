object P20 {
  def removeAt[A](n:Int, ls:List[A]):(List[A], A) = ls.splitAt(n) match {
    case (Nil, _) => throw new Exception()
    case (pre, e::post) => (pre:::post, e)
    case (_, Nil) => throw new Exception()
  }
}

// vim: set ts=4 sw=4 et:
