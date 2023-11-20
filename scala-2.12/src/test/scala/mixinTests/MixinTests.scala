package io.github.malyszaryczlowiek
package mixinTests

import mixins.{First, FirstSecondThird, Second, Third}

import org.scalatest.funsuite.AnyFunSuite


class MixinTests extends AnyFunSuite {


  test("create mixin in the fly") {
    val m: First with Second with Third = new First with Second with Third {
      override def first: String  = s"override first" // super.first
      override def second: String = s"override second" // super.second
      override def third: String  = s"override third" // super.third
    }
    assert(m.first == s"override first")
  }

  

  test ("creation of incomplete mixin type") {
    val m: First with Second = new FirstSecondThird
    assert(m.first == s"first")
  }



}
