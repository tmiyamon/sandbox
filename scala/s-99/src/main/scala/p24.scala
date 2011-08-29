object P24 {
  import P23._
  def lotto(count:Int, max:Int): List[Int] = {
    randomSelect(count, List.range(1, max+1))
  }
}
// vim: set ts=4 sw=4 et:
