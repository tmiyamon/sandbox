object P1 {
  def last[T](a:List[T]): T = a match {
    case a :: Nil => a
    case a :: tail => last(tail)
    case _ => throw new Exception
  }
}
