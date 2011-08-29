object P11 {
  import P10._
  def encodeModified[T](ls: List[T]): List[Any] = {
    encode(ls) map { e => if( e._1 == 1 ) e._2 else e}
  }
}
// vim: set ts=4 sw=4 et:
