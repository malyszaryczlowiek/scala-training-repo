package io.github.malyszaryczlowiek
package overridingmethodoftraitlimiterTests

import io.github.malyszaryczlowiek.overridingmethodoftraitlimiter.ImplementerClass
import org.scalatest.funsuite.AnyFunSuite

class OverridingMethodOfTraitLimiter extends AnyFunSuite{

  test("test if overridden method is used.") {
    val c = new ImplementerClass
    assert(c.first == "first from Limiter")
  }

}
