package io.github.malyszaryczlowiek
package implicitfunctiontypes

import implicitfunctiontypes.ImplicitFunctionTypeClass.{Foo, Bar}

class ImplicitFunctionTypeClass {

  /**
   * method takes function which Foo argument is implicit
   * @param f
   */
  def doSomething(f: Foo ?=> Bar)(using ff: Foo): Bar =
    f

}
object ImplicitFunctionTypeClass {

  case class Foo(str: String)
  case class Bar(str: String)

}
