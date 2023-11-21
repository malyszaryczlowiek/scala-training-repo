package io.github.malyszaryczlowiek
package traitlimiters

trait RequiredFirstTrait {
  
  // must be at top of trait
  // this means that this trait may be extended only
  // by other trait/class which extends trait 'First'
  this: First =>

}
