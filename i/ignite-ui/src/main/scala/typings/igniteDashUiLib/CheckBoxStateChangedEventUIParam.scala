package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBoxStateChangedEventUIParam extends js.Object {
  /**
  	 * Gets reference to the grid the RowSelectors are initialized for.
  	 */
  var grid: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Checks if the header check box is the one being clicked. In this case no row related args are passed.
  	 */
  var isHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets reference to the igGridRowSelectors.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the row the clicked row selector resides in.
  	 */
  var row: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the index of the row the clicked row selector resides in.
  	 */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the key of the row the clicked row selector resides in.
  	 */
  var rowKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets reference to the row selector cell.
  	 */
  var rowSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the state of the checkbox ("on","off").
  	 */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

