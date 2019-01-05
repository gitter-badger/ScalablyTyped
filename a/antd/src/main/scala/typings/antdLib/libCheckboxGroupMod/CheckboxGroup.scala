package typings
package antdLib.libCheckboxGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxGroup
  extends reactLib.reactMod.Component[CheckboxGroupProps, CheckboxGroupState, js.Any] {
  def getChildContext(): antdLib.Anon_CheckboxGroupAnonToggleOptionOption = js.native
  def getOptions(): js.Array[CheckboxOptionType] = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCheckboxGroup(nextProps: CheckboxGroupProps, nextState: CheckboxGroupState): scala.Boolean = js.native
  def toggleOption(option: CheckboxOptionType): scala.Unit = js.native
}

