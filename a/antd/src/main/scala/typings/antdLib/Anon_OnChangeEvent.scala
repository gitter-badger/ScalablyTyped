package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_OnChangeEvent extends js.Object {
  var disabled: scala.Boolean = js.native
  var name: java.lang.String = js.native
  @JSName("onChange")
  var onChange_Original: reactLib.reactMod.ReactNs.ChangeEventHandler[reactLib.HTMLInputElement with stdLib.HTMLInputElement] = js.native
  var value: js.Any = js.native
  def onChange(
    event: reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement with stdLib.HTMLInputElement]
  ): scala.Unit = js.native
}

