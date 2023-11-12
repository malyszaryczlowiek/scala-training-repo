package io.github.malyszaryczlowiek
package sealedtrait

/**
 * sealed trait means that we can define subtypes of it
 * only in the same file.
 */
sealed trait SealedTrait
case class Foo() extends SealedTrait
case object Bar extends  SealedTrait


@main def main(args: String*): Unit =

  RunSealedTrait.run()

end main




object RunSealedTrait:

  def run(): Unit =
    val f = Foo()
    val b = Bar
    println(s"$f")
    println(s"$b")
  end run

end RunSealedTrait