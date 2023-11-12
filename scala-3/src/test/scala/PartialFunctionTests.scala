package io.github.malyszaryczlowiek

import org.scalatest.funsuite.AnyFunSuite


class PartialFunctionTests extends AnyFunSuite {



  test(s"Defining partial function") {

    val pf: PartialFunction[String, Int] = {
      case s"simple" => 1
    }

    // checking if we can run partial function
    if pf.isDefinedAt("not simple") then
      println(s"matching")
    else
      println(s"not matching")


    // lift return Option() object
    println(s"${pf.lift(s"none")}")

    // zmiana typu zwracanego
    val andThen = pf.andThen[String](
      (int: Int) => {
        if int > 0 then s"above 0"
        else s"zero or below"
      }
    )

    // returns above 0
    println(s"${andThen("simple")}")




  }

}
