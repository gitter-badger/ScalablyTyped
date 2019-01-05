package typings
package atMaterialCheckboxLib.checkboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atMaterialSelectionDashControlLib.selectionDashControlMod.MDCSelectionControl because Inheritance from two classes */ @JSImport("@material/checkbox", "MDCCheckbox")
@js.native
class MDCCheckbox ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialCheckboxLib.adapterMod.MDCCheckboxAdapter, 
      atMaterialCheckboxLib.foundationMod.default
    ] {
  var checked: scala.Boolean = js.native
  var disabled: scala.Boolean = js.native
  var indeterminate: scala.Boolean = js.native
  val ripple: atMaterialRippleLib.rippleMod.MDCRipple = js.native
  var value: java.lang.String = js.native
}

@JSImport("@material/checkbox", "MDCCheckbox")
@js.native
object MDCCheckbox extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialCheckboxLib.checkboxMod.MDCCheckbox = js.native
}

