package io.github.malyszaryczlowiek
package i10sealedtrait

// illegal inheritence from sealed trait
// cannot extend sealed trait in external file
// code below does not work
class ExternalClass extends SealedTrait

// class ExternalClass


