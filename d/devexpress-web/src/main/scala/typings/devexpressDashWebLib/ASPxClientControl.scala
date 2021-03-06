package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base type for all the objects included in the client-side object model.
  */
trait ASPxClientControl extends ASPxClientControlBase {
  /**
    * Modifies the control's size against the control's container.
    */
  def AdjustControl(): scala.Unit
  /**
    * Returns the control's height.
    */
  def GetHeight(): scala.Double
  /**
    * Returns the control's width.
    */
  def GetWidth(): scala.Double
  /**
    * Specifies the control's height.   Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  def SetHeight(height: scala.Double): scala.Unit
  /**
    * Specifies the control's width.
    * @param width An integer value that specifies the control's width.
    */
  def SetWidth(width: scala.Double): scala.Unit
}

