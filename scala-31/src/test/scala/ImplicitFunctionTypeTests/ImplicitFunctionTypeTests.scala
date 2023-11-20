package io.github.malyszaryczlowiek
package ImplicitFunctionTypeTests


import implicitfunctiontypes.ImplicitFunctionTypeClass
import implicitfunctiontypes.ImplicitFunctionTypeClass.Foo
import implicitfunctiontypes.ImplicitFunctionTypeClass.Bar

import org.scalatest.funsuite.AnyFunSuite

class ImplicitFunctionTypeTests extends AnyFunSuite {

  test("testing implicit function types.") {

    // it must be METHOD not anonymous Function !!!
    def f(using ff: Foo): Foo ?=> Bar = {
      Bar(ff.str.toUpperCase)
    }

    // this object is implicitly injected to f method
    // when f is used as argument in doSomething method.
    given foo: Foo = Foo("dziala")

    val iClass = new ImplicitFunctionTypeClass
    val b: Bar = iClass.doSomething( f )

    println(s"${b.str}")
    assert(b.str.equals(s"DZIALA"), "not match")


  }


}
