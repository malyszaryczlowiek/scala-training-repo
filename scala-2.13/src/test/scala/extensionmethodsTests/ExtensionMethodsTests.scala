package io.github.malyszaryczlowiek
package extensionmethodsTests

import extensionmethods.NotExtendableClass

import org.scalatest.funsuite.AnyFunSuite

class ExtensionMethodsTests extends AnyFunSuite {

  test(s""){

    val e = new NotExtendableClass(9)

    // Extension in scala 2.13 not possible

//    extension (e: NotExtendableClass) {
//      def printExtension(): Unit = println(s"Extension value: ${e.i}")
//      private def printPrivateExtension(): Unit = println(s"Extension value: ${e.i}")
//    }
//
//    e.printExtension()
//    e.printPrivateExtension()
  }

}
