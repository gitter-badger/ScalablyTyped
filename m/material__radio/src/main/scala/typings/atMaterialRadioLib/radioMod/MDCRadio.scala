package typings
package atMaterialRadioLib.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atMaterialSelectionDashControlLib.selectionDashControlMod.MDCSelectionControl because Inheritance from two classes */ @JSImport("@material/radio", "MDCRadio")
@js.native
class MDCRadio ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialRadioLib.adapterMod.MDCRadioAdapter, 
      atMaterialRadioLib.foundationMod.default
    ] {
  var checked: scala.Boolean = js.native
  var disabled: scala.Boolean = js.native
  val ripple: atMaterialRippleLib.rippleMod.MDCRipple = js.native
  var value: java.lang.String = js.native
}

@JSImport("@material/radio", "MDCRadio")
@js.native
object MDCRadio extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialRadioLib.radioMod.MDCRadio = js.native
}

