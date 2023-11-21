package io.github.malyszaryczlowiek
package overridingmethodoftraitlimiter

trait Limiter {

  this: First =>

  /**
   * here i override method even if i do not extends
   * First trait
   *
   * @return
   */
  override def first: String = s"first from Limiter"

}
