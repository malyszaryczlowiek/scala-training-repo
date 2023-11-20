package io.github.malyszaryczlowiek
package constructorexecutionorderingTests

import constructorexecutionordering.ImplementationClass

import org.scalatest.funsuite.AnyFunSuite

class ConstructorOrderingTests extends AnyFunSuite {

  test("checking constructor execution order") {

    val c = new ImplementationClass
    println()
    c.run()

  }

}
