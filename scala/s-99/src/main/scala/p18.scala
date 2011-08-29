object P18 {
  def slice[A](from:Int, to:Int, ls:List[A]):List[A] = {
    ls.take(to).drop(from)
  }
}

// vim: set ts=4 sw=4 et:
