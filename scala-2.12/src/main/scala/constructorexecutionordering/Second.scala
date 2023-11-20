package io.github.malyszaryczlowiek
package constructorexecutionordering

trait Second {
  println(s"second")

  def run(): Unit = println(s"RUN second")
}
