object P22 {
  // def range(f:Int, t:Int):List[Int] = {
    // def rangeR(f:Int, t:Int, ret:List[Int]):List[Int] = {
      // if(f == t) (f::ret).reverse
      // else {
        // rangeR(f+1, t, f::ret)
      // }
    // }
    // rangeR(f, t, List())
  // }
  def unfoldRight[A, B](s:B)(f:B => Option[(A, B)]): List[A] =
    f(s) match {
      case None => Nil
      case Some((r, n)) => r::unfoldRight(n)(f)
    }

  def range(start:Int, end:Int):List[Int] = {
    unfoldRight(start){ n =>
      if(n > end) None
      else Some((n, n + 1))
    }
  }
}

// vim: set ts=4 sw=4 et:
