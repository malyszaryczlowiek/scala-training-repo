package io.github.malyszaryczlowiek
package traitlimiters

trait RequiredFirstTraitAndMethodsSecondAndThird {

  // must be at top
  // this means that this trait
  // may be extended only by other trait/class which
  // implements both this methods namely second and third
  // note it is possible to use & between First and listing methods
  this: Zero with First {def second: String; def third: String} =>

  def pass: String = s"pass"

}
