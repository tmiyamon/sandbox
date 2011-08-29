object P26 {
  def flatMapSublists[A, B](ls:List[A])(f:(List[A]) => List[B]):List[B] =
    ls match {
      case Nil => Nil
      case sublist@(_::tail) => {
        val a = f(sublist)
        val b = flatMapSublists(tail)(f)
        println("flatMap: %s, %s" format(a, b) )
        //f(sublist):::flatMapSublists(tail)(f)
        a ::: b
      }
    }

  def combinations[A](n:Int, ls:List[A]):List[List[A]] = {
    // println("continations(%d): %s" format(n, ls))
    if(n == 0) List(Nil)
    else flatMapSublists(ls) { sl =>
      // println("f: " + sl)
      combinations(n-1,  sl.tail) map { t =>
        // println("map: " + (sl.head, t))
        sl.head :: t
      }
    }
  }
}

// vim: set ts=4 sw=4 et:
