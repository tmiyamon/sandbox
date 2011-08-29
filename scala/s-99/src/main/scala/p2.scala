object P2 {
  def penultimate[T](a: List[T]): T = a match {
    case a :: b :: Nil => a
    case a :: b :: tail => penultimate(b::tail)
    case _ => throw new Exception
  }
}
// vim: set ts=4 sw=4 et:
