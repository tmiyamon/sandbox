object P14 {
  def duplicate[A](ls: List[A]):List[A] = {
    ls.flatMap(e => List(e, e))
  }
}

// vim: set ts=4 sw=4 et:
