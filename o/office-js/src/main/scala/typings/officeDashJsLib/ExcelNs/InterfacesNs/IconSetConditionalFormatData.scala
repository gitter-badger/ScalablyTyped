package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "iconSetConditionalFormat.toJSON()". */
trait IconSetConditionalFormatData extends js.Object {
  /**
    *
    * An array of Criteria and IconSets for the rules and potential custom icons for conditional icons. Note that for the first criterion only the custom icon can be modified, while type, formula, and operator will be ignored when set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[js.Array[officeDashJsLib.ExcelNs.ConditionalIconCriterion]] = js.undefined
  /**
    *
    * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
    *
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * If true, hides the values and only shows icons.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showIconOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * If set, displays the IconSet option for the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    officeDashJsLib.ExcelNs.IconSet | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.ThreeArrows | officeDashJsLib.officeDashJsLibStrings.ThreeArrowsGray | officeDashJsLib.officeDashJsLibStrings.ThreeFlags | officeDashJsLib.officeDashJsLibStrings.ThreeTrafficLights1 | officeDashJsLib.officeDashJsLibStrings.ThreeTrafficLights2 | officeDashJsLib.officeDashJsLibStrings.ThreeSigns | officeDashJsLib.officeDashJsLibStrings.ThreeSymbols | officeDashJsLib.officeDashJsLibStrings.ThreeSymbols2 | officeDashJsLib.officeDashJsLibStrings.FourArrows | officeDashJsLib.officeDashJsLibStrings.FourArrowsGray | officeDashJsLib.officeDashJsLibStrings.FourRedToBlack | officeDashJsLib.officeDashJsLibStrings.FourRating | officeDashJsLib.officeDashJsLibStrings.FourTrafficLights | officeDashJsLib.officeDashJsLibStrings.FiveArrows | officeDashJsLib.officeDashJsLibStrings.FiveArrowsGray | officeDashJsLib.officeDashJsLibStrings.FiveRating | officeDashJsLib.officeDashJsLibStrings.FiveQuarters | officeDashJsLib.officeDashJsLibStrings.ThreeStars | officeDashJsLib.officeDashJsLibStrings.ThreeTriangles | officeDashJsLib.officeDashJsLibStrings.FiveBoxes | officeDashJsLib.officeDashJsLibStrings.LinkedEntityFinanceIcon | officeDashJsLib.officeDashJsLibStrings.LinkedEntityMapIcon
  ] = js.undefined
}

