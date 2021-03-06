package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What operations are supported?
  */
trait CapabilityStatementRestInteraction extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * transaction | batch | search-system | history-system
    */
  var code: code
  /**
    * Anything special about operation behavior
    */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
}

