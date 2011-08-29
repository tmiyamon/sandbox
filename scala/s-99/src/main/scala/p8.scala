object P8 {
  def compress[T](ls: List[T]): List[T] = {
    ls.foldRight(List[T]()){(h, r) =>
      if(r.isEmpty || r.head != h) h::r
      else r
    }
  }
}

// vim: set ts=4 sw=4 et:
