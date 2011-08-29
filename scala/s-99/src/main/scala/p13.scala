object P13 {
  def encodeDirect[A](ls: List[A]):List[(Int, A)] = {
    if(ls == Nil) Nil
    else {
      val (packed, next) = ls span{ _ == ls.head }
      (packed.length, packed.head)::encodeDirect(next)
    }
  }
}

// vim: set ts=4 sw=4 et:
