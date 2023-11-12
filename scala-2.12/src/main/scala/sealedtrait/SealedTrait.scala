package io.github.malyszaryczlowiek
package sealedtrait

sealed trait SealedTrait
case class Foo() extends SealedTrait
case object Bar extends  SealedTrait

