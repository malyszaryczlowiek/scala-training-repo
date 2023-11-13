package io.github.malyszaryczlowiek
package patternmatching.standardclasses

class External(val internal: Internal = new Internal())
object External {

  def unapply(arg: External): Option[Internal] =
    println(s"External.unapply() called")
    Some(arg.internal)

}

