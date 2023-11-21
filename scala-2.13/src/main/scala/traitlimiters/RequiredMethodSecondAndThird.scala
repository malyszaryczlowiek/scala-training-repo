package io.github.malyszaryczlowiek
package traitlimiters

trait RequiredMethodSecondAndThird {

  // must be at top
  // this means that this trait
  // may be extended only by other trait/class which
  // implements both this methods namely second and third
  this: { def second: String ; def third: String } =>

}
