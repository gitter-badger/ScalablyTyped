package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowCol[TEntity] extends js.Object {
  var col: uiDashGridLib.uiDashGridMod.uiGridNs.IGridColumnOf[TEntity]
  var row: uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity]
  /**
    * Gets the intersection of where the row and column meet.
    * @returns The value from the grid data that this RowCol points to.  If the column has a cellFilter this
    *          will also apply the filter to it and return the value that the filter displays
    */
  def getIntersectionValueFiltered(): java.lang.String | stdLib.Number | js.Object
  /**
    * Gets the intersection of where the row and column meet
    * @returns The value from the grid data that this RowCol points to.  If the column has a cellFilter this
    *          will NOT return the filtered value.
    */
  def getIntersectionValueRaw(): java.lang.String | stdLib.Number | js.Object
}

