package io.github.malyszaryczlowiek
package abstracttypemembers.typemembers

trait Upper {
  type M

  def method(m: M): Unit = println(s"Calling Upper.method(M)")
}
