object P3 {
  def nth[T](n: Int,  a: List[T]):T  = (n, a) match {
    case (0, head :: _) => head
    case (n, _ :: tail) => nth(n - 1, tail)
    case (_, Nil) => throw new Exception
  }
}

// vim: set ts=4 sw=4 et:
