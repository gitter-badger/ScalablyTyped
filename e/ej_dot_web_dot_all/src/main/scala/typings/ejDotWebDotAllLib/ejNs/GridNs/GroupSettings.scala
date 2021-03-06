package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupSettings extends js.Object {
  /** Gets or sets a value that customize the group caption format.
    * @Default {null}
    */
  var captionFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to enable animation button option in the group drop area of the grid.
    * @Default {false}
    */
  var enableDropAreaAutoSizing: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to add grouped columns programmatically at initial load
    * @Default {[]}
    */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a value that indicates whether to show the group drop area just above the column header. It can be used to avoid ungrouping the already grouped column using
    * groupSettings.
    * @Default {true}
    */
  var showDropArea: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to hide the grouped columns from the grid
    * @Default {false}
    */
  var showGroupedColumn: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to show the group button image(toggle button)in the column header and also in the grouped column in the group drop area . It can be
    * used to group/ungroup the columns by click on the toggle button.
    * @Default {false}
    */
  var showToggleButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the close button in the grouped column which is in the group drop area to ungroup the grouped column
    * @Default {false}
    */
  var showUngroupButton: js.UndefOr[scala.Boolean] = js.undefined
}

