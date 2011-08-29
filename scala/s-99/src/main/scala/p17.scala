object P17 {
  def split[A](n:Int, ls:List[A]):(List[A], List[A]) = {
    (ls.take(n), ls.drop(n))
  }
}

// vim: set ts=4 sw=4 et:
