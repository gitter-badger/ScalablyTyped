package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The designation to be included
  */
trait ExpansionProfileDesignationIncludeDesignation extends BackboneElement {
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  /**
    * Human language of the designation to be included
    */
  var language: js.UndefOr[code] = js.undefined
  /**
    * What kind of Designation to include
    */
  var use: js.UndefOr[Coding] = js.undefined
}

