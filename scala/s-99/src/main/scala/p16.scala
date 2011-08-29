object P16 {
  // def drop[A](n:Int, ls:List[A]):List[A] = {
    // if(ls.length < n) ls
    // else {
      // val (l, r) = ls splitAt(n)
      // l.init:::drop(n, r)
    // }
  // }
  def drop[A](n:Int, ls:List[A]):List[A] = {
    ls.zipWithIndex.collect{case (a, b) if (b+1) % 3 != 0 => a}
  }

}

// vim: set ts=4 sw=4 et:
