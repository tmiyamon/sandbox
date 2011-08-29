package arithmetic {
  class S99Int(val start: Int) {
    import S99Int._
  }

  object S99Int {
    implicit def int2S99Int(i: Int): S99Int = new S99Int(i)

  }
}

// vim: set ts=4 sw=4 et:
