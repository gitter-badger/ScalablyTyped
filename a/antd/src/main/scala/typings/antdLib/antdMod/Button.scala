package typings
package antdLib.antdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Button")
@js.native
class Button protected ()
  extends antdLib.libButtonMod.default {
  def this(props: antdLib.libButtonButtonMod.ButtonProps) = this()
}

@JSImport("antd", "Button")
@js.native
object Button extends js.Object {
  @JSName("Group")
  var Group_Original: reactLib.reactMod.ReactNs.SFC[antdLib.libButtonButtonDashGroupMod.ButtonGroupProps] = js.native
  var __ANT_BUTTON: scala.Boolean = js.native
  var defaultProps: antdLib.Anon_PrefixClsLoading = js.native
  var propTypes: antdLib.Anon_Type = js.native
  def Group(props: antdLib.libButtonButtonDashGroupMod.ButtonGroupProps with reactLib.Anon_Children): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def Group(
    props: antdLib.libButtonButtonDashGroupMod.ButtonGroupProps with reactLib.Anon_Children,
    context: js.Any
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
}

