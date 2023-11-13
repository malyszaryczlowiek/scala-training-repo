package io.github.malyszaryczlowiek
package patternmatching.standardclasses

class Internal(val i: Int = 0)
object Internal {

  def unapply(ii:Internal): Option[Int] = {
    println(s"Internal.unapply() called")
    Some(ii.i)
  }

}
