package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the background of a range object.
  *
  * [Api set: ExcelApi 1.1]
  */
trait RangeFillLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * HTML color code representing the color of the background, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the pattern of a Range. See Excel.FillPattern for details. LinearGradient and RectangularGradient are not supported.
    A null value indicates that the entire range doesn't have uniform pattern setting.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var pattern: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Sets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    Gets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500").
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var patternColor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a pattern color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the pattern tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var patternTintAndShade: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var tintAndShade: js.UndefOr[scala.Boolean] = js.undefined
}

