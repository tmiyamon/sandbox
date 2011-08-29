object P28 {
  def lsort[A](ls:List[List[A]]): List[List[A]] = {
    ls.sortWith(_.length > _.length )
  }
  def lsortFreq[A](ls:List[List[A]]): List[List[A]] = {
    ls.groupBy(a => a.length).toList.sortBy(a => a._2.length).flatMap(a => a._2)
  }
}

// vim: set ts=4 sw=4 et:
