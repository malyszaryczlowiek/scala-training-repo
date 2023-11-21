package io.github.malyszaryczlowiek
package bigintandbigdecimalTests

import org.scalatest.funsuite.AnyFunSuite


class BigIntAndBigDecimalTests extends AnyFunSuite {


  test(s"BigDecimal addition") {
    val start = BigDecimal(s"04.445").setScale(2, BigDecimal.RoundingMode.HALF_UP)
    val end = BigDecimal(s"108.445").setScale(2, BigDecimal.RoundingMode.HALF_UP)
    val result = start.+(end)
    println(result)
  }







  /*
  Testing Ranges with BigInt and Big Decimal
   */

  test(s"create range from BigInt") {
    val start = BigInt(s"0")
    val end   = BigInt(s"10")
    println(s"$start")
    println(s"$end")
    val r = start until end by 2
    r.foreach(println)
  }



  test(s"create range from BigDecimal") {
    val start = BigDecimal(s"04.7788").setScale(2, BigDecimal.RoundingMode.HALF_UP )
    val end   = BigDecimal(s"108.333").setScale(2, BigDecimal.RoundingMode.HALF_UP )
    val byVal = BigDecimal(s"3.556").setScale(2,   BigDecimal.RoundingMode.HALF_UP )
    println(s"$start")
    println(s"$end")
    println()
    val r = start until end by byVal
    r.foreach(println)
  }


}
