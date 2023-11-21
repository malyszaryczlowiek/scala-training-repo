package io.github.malyszaryczlowiek
package traitlimiterTests

import traitlimiters.FirstSecondThird

import org.scalatest.funsuite.AnyFunSuite

class TraitLimiterTests extends AnyFunSuite {


  //
  test("testing limiters. Limiter is set to both trait and method. ") {
    val c = new FirstSecondThird

    assert(c.zero   == "zero")
    assert(c.pass   == "pass")
    assert(c.first  == "first")
    assert(c.second == "second")
    assert(c.third  == "third")
  }

}
