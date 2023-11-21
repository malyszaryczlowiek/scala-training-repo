package io.github.malyszaryczlowiek

import org.scalatest.funsuite.AnyFunSuite

class VarargsTests extends AnyFunSuite {

  test(s"does definition with * compile") {

    def varargs(str: String*): Unit = {}

  }


  test(s"does definition with * compile and we can pass any collection") {

    def varargs(str: String*): Unit = {}

    varargs("a", "b")
    // varargs(Array.empty[String]) // not works
    varargs(Array.empty[String]: _* ) // works

  }

}
