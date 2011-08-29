object P12 {
  def decode(ls: List[(Int, Symbol)]):List[Symbol] = {
    ls.flatMap(e => List.fill(e._1)(e._2))
  }
}

// vim: set ts=4 sw=4 et:
