package io.github.malyszaryczlowiek

import sealedtrait.{Bar, Foo}

object Main:


  def main(args: Array[String]): Unit =

    val f = Foo()
    val b = Bar
    println(s"$f")
    println(s"$b")

  end main
  
  

end Main

