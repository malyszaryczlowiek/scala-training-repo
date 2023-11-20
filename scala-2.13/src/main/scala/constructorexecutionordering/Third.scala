package io.github.malyszaryczlowiek
package constructorexecutionordering

trait Third {
  println(s"third")

  def run(): Unit = println(s"RUN third")
}
