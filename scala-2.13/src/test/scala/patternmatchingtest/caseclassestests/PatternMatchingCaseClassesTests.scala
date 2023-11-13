package io.github.malyszaryczlowiek
package patternmatchingtest.caseclassestests

import patternmatching.caseclasses.{External, Internal}

import org.scalatest.funsuite.AnyFunSuite

class PatternMatchingCaseClassesTests extends AnyFunSuite {

  test("Case classes NEED unapply method of internal classes") {
    val e = External() // without brackets not compile
    e match {
      case External(Internal(i: Int)) =>
        println(s"internal unapply called. ok i = ${i}")
        assert(true)
      case External(internal: Internal) =>
        println(s"only external unapply called, ok i = ${internal.i}")
        assert(true)
      case External(_) =>
        assert(false, s"not parsing without explicitly defined unapply method")
      case _ =>
        assert(false, s"not match to External case class. ")

    }
  }

}
