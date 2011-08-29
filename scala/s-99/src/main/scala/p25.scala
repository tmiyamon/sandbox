object P25 {
  import P23._
  def randomPermute[A](ls:List[A]):List[A] = randomSelect(ls.length, ls)
}

// vim: set ts=4 sw=4 et:
