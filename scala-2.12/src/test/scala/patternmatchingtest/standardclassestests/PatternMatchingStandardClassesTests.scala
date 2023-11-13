package io.github.malyszaryczlowiek
package patternmatchingtest.standardclassestests

import patternmatching.standardclasses.{External, Internal}

import org.scalatest.funsuite.AnyFunSuite

class PatternMatchingStandardClassesTests extends AnyFunSuite {

  /**
   * not compile without unapply methods
   */
  test("standard classes NEED unapply method of internal classes, but not match in pattern matching") {
    val e = new External()
    e match {
      // this case is not matching but it calls Internal.unapply
      case External(Internal(i: Int)) =>
        println(s"calling internal unapply method")
        assert(true)
      // this case matches but NOT calls Internal.unapply !!!!
      case External(internal: Internal) =>
        println(s"calling external and internal unapply methods but internal not match. ok i = ${internal.i}")
        assert(true)
      case External(_) =>
        assert(false, s"not parsing without explicitly defined unapply method")
      case _ =>
        assert(false, s"not match to External case class. ")
    }
    /*
    RESULT: Same scala 2.13
    External.unapply() called
    Internal.unapply() called
    calling internal unapply method
     */
  }


}
