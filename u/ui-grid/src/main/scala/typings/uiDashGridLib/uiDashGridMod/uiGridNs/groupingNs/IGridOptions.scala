package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * Enable row grouping for entire grid.
    * Defaults to true
    * @default true
    */
  var enableGroupHeaderSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allows group header rows to be selected.
    * Defaults to false
    * @default false
    */
  var enableGrouping: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The string to use for the grouping header row label on rows which contain
    * a null or undefined value in the grouped column.
    * Defaults to "Null"
    * @default 'Null'
    */
  var groupingNullLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Shows counts on the groupHeader rows.
    * Note that if you are using a cellFilter or a sortingAlgorithm which relies on a specific format or data
    * type, showing counts may cause that to break, since the group header rows will always be a string with
    * groupingShowCounts enabled. Defaults to true except on columns of type 'date'
    * @default true
    */
  var groupingShowCounts: js.UndefOr[scala.Boolean] = js.undefined
}

