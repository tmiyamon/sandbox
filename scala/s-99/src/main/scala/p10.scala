object P10 {
  import P9._
  def encode[T](ls: List[T]):List[(Int, T)] = {
    pack(ls) map{ a => (a.length, a.head)}
  }
}

// vim: set ts=4 sw=4 et:
