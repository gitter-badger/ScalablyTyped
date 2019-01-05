package typings
package antdLib.libTransferSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search
  extends reactLib.reactMod.Component[TransferSearchProps, js.Any, js.Any] {
  def handleChange(e: reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement with stdLib.HTMLInputElement]): scala.Unit = js.native
  def handleClear(
    e: reactLib.reactMod.ReactNs.MouseEvent[
      reactLib.HTMLAnchorElement with stdLib.HTMLAnchorElement, 
      reactLib.MouseEvent with stdLib.MouseEvent
    ]
  ): scala.Unit = js.native
}

