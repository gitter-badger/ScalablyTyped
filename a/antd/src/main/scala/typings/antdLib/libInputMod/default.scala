package typings
package antdLib.libInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/input", JSImport.Default)
@js.native
class default protected ()
  extends antdLib.libInputInputMod.default {
  def this(props: antdLib.libInputInputMod.InputProps) = this()
}

@JSImport("antd/lib/input", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("Group")
  var Group_Original: reactLib.reactMod.ReactNs.StatelessComponent[antdLib.libInputGroupMod.GroupProps] = js.native
  var Password: antdLib.Anon_DefaultPropsAnonAction = js.native
  var Search: antdLib.Anon_DefaultPropsAnonEnterButton = js.native
  var TextArea: org.scalablytyped.runtime.Instantiable0[antdLib.libInputTextAreaMod.default] = js.native
  var defaultProps: antdLib.Anon_DisabledType = js.native
  var propTypes: antdLib.Anon_AddonAfter = js.native
  def Group(props: antdLib.libInputGroupMod.GroupProps with reactLib.Anon_Children): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def Group(props: antdLib.libInputGroupMod.GroupProps with reactLib.Anon_Children, context: js.Any): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def getDerivedStateFromProps(nextProps: antdLib.libInputInputMod.InputProps): antdLib.Anon_ValueArray | scala.Null = js.native
}

