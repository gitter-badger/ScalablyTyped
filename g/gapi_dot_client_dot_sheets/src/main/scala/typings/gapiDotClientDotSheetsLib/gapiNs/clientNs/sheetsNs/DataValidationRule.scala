package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataValidationRule extends js.Object {
  /** The condition that data in the cell must match. */
  var condition: js.UndefOr[BooleanCondition] = js.undefined
  /** A message to show the user when adding data to the cell. */
  var inputMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * True if the UI should be customized based on the kind of condition.
    * If true, "List" conditions will show a dropdown.
    */
  var showCustomUi: js.UndefOr[scala.Boolean] = js.undefined
  /** True if invalid data should be rejected. */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

