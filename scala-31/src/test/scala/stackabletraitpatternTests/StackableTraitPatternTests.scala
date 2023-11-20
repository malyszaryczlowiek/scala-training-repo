package io.github.malyszaryczlowiek
package stackabletraitpatternTests


import stackabletraitpattern.{First, FirstSecondThird, Second, Third}
import org.scalatest.funsuite.AnyFunSuite

class StackableTraitPatternTests extends AnyFunSuite {


  /**
   * Ordering in type does not matter for type itself but matters
   * in case of methods execution. Later trait method overrides
   * earlier one.
   */
  test("testing assignment of different orders of types") {
    val c1: Third with Second with First = new FirstSecondThird
    assert( c1.isInstanceOf[First with Second with Third] )
    assert( c1.isInstanceOf[First with Third with Second] )
  }



}
