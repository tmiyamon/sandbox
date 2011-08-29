object P4 {
  def length[T](a:List[T]): Int = _length(0, a)

  def _length[T](n:Int, a:List[T]): Int = (n, a) match {
    case (n, Nil) => n
    case (n, _::tail) => _length(n+1, tail)
  }
}

// vim: set ts=4 sw=4 et:
