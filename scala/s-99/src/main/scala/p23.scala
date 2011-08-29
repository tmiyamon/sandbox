object P23 {
  import P20._
  def randomSelect[A](n:Int, ls:List[A]):List[A] = {
    def randomSelectR(n:Int, ls:List[A], r:util.Random):List[A] = {
      if(n <= 0) Nil
      else{
        val (rest, e) = removeAt(r.nextInt(ls.length), ls)
        e::randomSelectR(n-1, rest, r)
      }
    }

    randomSelectR(n, ls, new util.Random)
  }
}

// vim: set ts=4 sw=4 et:
