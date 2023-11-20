package io.github.malyszaryczlowiek
package constructorexecutionordering

trait First {
  println(s"first")

  def run(): Unit = println(s"RUN first")

  // when i call it in constructor, it is override via
  // implementation of class extending this trait
  run()
}
