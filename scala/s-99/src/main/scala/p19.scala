object P19 {
  def rotate[A](n:Int, ls:List[A]):List[A] = {
    ls.slice(n, ls.length):::ls.take(n)
  }
}

// vim: set ts=4 sw=4 et:
