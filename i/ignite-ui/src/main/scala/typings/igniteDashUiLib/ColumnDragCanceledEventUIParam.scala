package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDragCanceledEventUIParam extends js.Object {
  /**
  	 * Gets the column index of the column that was being dragged.
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the column key of the column that was being dragged.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the orginal th being dragged.
  	 */
  var header: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to cloned DOM element that was actually being dragged.
  	 */
  var helper: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the widget.
  	 */
  var owner: js.UndefOr[java.lang.String] = js.undefined
}

