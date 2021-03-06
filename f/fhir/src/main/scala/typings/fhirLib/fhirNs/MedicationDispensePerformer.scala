package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who performed event
  */
trait MedicationDispensePerformer extends BackboneElement {
  /**
    * Individual who was performing
    */
  var actor: Reference
  /**
    * Organization organization was acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
}

