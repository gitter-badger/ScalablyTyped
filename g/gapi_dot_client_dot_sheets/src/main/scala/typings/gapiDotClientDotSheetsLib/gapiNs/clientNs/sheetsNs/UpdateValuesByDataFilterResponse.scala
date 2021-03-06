package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateValuesByDataFilterResponse extends js.Object {
  /** The data filter that selected the range that was updated. */
  var dataFilter: js.UndefOr[DataFilter] = js.undefined
  /** The number of cells updated. */
  var updatedCells: js.UndefOr[scala.Double] = js.undefined
  /** The number of columns where at least one cell in the column was updated. */
  var updatedColumns: js.UndefOr[scala.Double] = js.undefined
  /**
    * The values of the cells in the range matched by the dataFilter after all
    * updates were applied. This is only included if the request's
    * `includeValuesInResponse` field was `true`.
    */
  var updatedData: js.UndefOr[ValueRange] = js.undefined
  /** The range (in A1 notation) that updates were applied to. */
  var updatedRange: js.UndefOr[java.lang.String] = js.undefined
  /** The number of rows where at least one cell in the row was updated. */
  var updatedRows: js.UndefOr[scala.Double] = js.undefined
}

