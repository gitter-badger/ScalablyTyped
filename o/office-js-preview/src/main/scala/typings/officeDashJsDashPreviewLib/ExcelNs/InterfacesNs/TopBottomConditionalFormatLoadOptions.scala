package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a Top/Bottom conditional format.
  *
  * [Api set: ExcelApi 1.6]
  */
trait TopBottomConditionalFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatLoadOptions] = js.undefined
  /**
    *
    * The criteria of the Top/Bottom conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[scala.Boolean] = js.undefined
}

