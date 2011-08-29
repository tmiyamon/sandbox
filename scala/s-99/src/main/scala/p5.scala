object P5 {
  def reverse[T](a:List[T]): List[T] =
    a.foldLeft(List[T]()){ (r, h) => h :: r }
}

// vim: set ts=4 sw=4 et:
