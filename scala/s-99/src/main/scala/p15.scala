object P15 {
  def duplicateN[A](n:Int, ls:List[A]):List[A] = ls flatMap{ e => List.fill(n)(e) }
}

// vim: set ts=4 sw=4 et:
