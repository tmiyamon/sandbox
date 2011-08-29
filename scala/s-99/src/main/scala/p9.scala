object P9 {
  def pack[T](ls: List[T]) : List[List[T]] = {
    if(ls.isEmpty) List(List())
    else{
      val (l, r) = ls.span(_ == ls.head)
      if(r == Nil) List(l)
      else l::pack(r)
    }
  }
}

// vim: set ts=4 sw=4 et:
