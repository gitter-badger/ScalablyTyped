package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.moveColumnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridMoveColumnsApi extends js.Object {
  // Events
  var on: uiDashGridLib.Anon_ColumnPositionChanged
  // Methods
  /**
    * Method can be used to change column position
    * @param {number} originalPosition Original column position as a 0 indexed integer
    * @param {number} newPosition New column position as a 0 indexed integer
    */
  def moveColumn(originalPosition: scala.Double, newPosition: scala.Double): scala.Unit
}

