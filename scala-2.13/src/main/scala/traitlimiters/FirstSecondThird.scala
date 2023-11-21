package io.github.malyszaryczlowiek
package traitlimiters

/**
 * All requirements forRequiredFirstTraitAndMethodsSecondAndThird are fulfilled
 * we extends First trait
 * and we have 'second' and 'third' methods from Second and Third traits.
 */
class FirstSecondThird extends First with Second with Third with RequiredFirstTraitAndMethodsSecondAndThird {

}
