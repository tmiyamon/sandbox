object P21 {
  def insertAt[A](a:A, n:Int, ls:List[A]):List[A] = ls.splitAt(n) match {
    case (pre, post) => pre:::a::post
  }
}

// vim: set ts=4 sw=4 et:
