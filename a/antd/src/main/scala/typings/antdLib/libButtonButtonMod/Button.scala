package typings
package antdLib.libButtonButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button
  extends reactLib.reactMod.Component[ButtonProps, js.Any, js.Any] {
  var buttonNode: js.Any = js.native
  var delayTimeout: js.Any = js.native
  @JSName("handleClick")
  var handleClick_Original: reactLib.reactMod.ReactNs.MouseEventHandler[
    (reactLib.HTMLButtonElement with stdLib.HTMLButtonElement) | (reactLib.HTMLAnchorElement with stdLib.HTMLAnchorElement)
  ] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MButton(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MButton(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MButton(nextProps: ButtonProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MButton(): scala.Unit = js.native
  def fixTwoCNChar(): scala.Unit = js.native
  def handleClick(
    event: reactLib.reactMod.ReactNs.MouseEvent[
      (reactLib.HTMLButtonElement with stdLib.HTMLButtonElement) | (reactLib.HTMLAnchorElement with stdLib.HTMLAnchorElement), 
      reactLib.NativeMouseEvent
    ]
  ): scala.Unit = js.native
  def isNeedInserted(): scala.Boolean = js.native
  def saveButtonRef(): scala.Unit = js.native
  def saveButtonRef(node: reactLib.HTMLElement with stdLib.HTMLElement): scala.Unit = js.native
}

