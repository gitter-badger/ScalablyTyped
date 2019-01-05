package typings
package antdLib.libAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert
  extends reactLib.reactMod.Component[AlertProps, AlertState, js.Any] {
  @JSName("state")
  var state_Alert: AlertState = js.native
  def animationEnd(): scala.Unit = js.native
  def handleClose(
    e: reactLib.reactMod.ReactNs.MouseEvent[
      reactLib.HTMLAnchorElement with stdLib.HTMLAnchorElement, 
      reactLib.MouseEvent with stdLib.MouseEvent
    ]
  ): scala.Unit = js.native
}

