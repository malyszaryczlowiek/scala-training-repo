package io.github.malyszaryczlowiek
package constructorexecutionordering

class ImplementationClass extends First with Second with Third {

  println(s"ImplementationClass")

  // run method must be override explicitly
  // override def run(): Unit = super.run()

  // here i override with Second trait implementation
  override def run(): Unit = super[Second].run()

}
