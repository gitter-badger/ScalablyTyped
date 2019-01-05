package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "ripple")
@js.native
object rippleNs extends js.Object {
  @js.native
  class MDCRipple ()
    extends atMaterialRippleLib.rippleMod.MDCRipple
  
  @js.native
  class MDCRippleFoundation ()
    extends atMaterialRippleLib.rippleMod.MDCRippleFoundation
  
  @js.native
  class RippleCapableSurface ()
    extends atMaterialRippleLib.rippleMod.RippleCapableSurface
  
  @js.native
  object MDCRipple extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialRippleLib.rippleMod.MDCRipple = js.native
    def attachTo(root: stdLib.Element, options: atMaterialRippleLib.Anon_IsUnbounded): atMaterialRippleLib.rippleMod.MDCRipple = js.native
    def createAdapter(instance: atMaterialRippleLib.rippleMod.RippleCapableSurface): atMaterialRippleLib.adapterMod.MDCRippleAdapter = js.native
  }
  
  @js.native
  object MDCRippleFoundation extends js.Object {
    val cssClasses: atMaterialRippleLib.constantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialRippleLib.adapterMod.MDCRippleAdapter = js.native
    val numbers: atMaterialRippleLib.constantsMod.numbers = js.native
    val strings: atMaterialRippleLib.constantsMod.strings = js.native
  }
  
  @JSName("util")
  @js.native
  object utilNs extends js.Object {
    def applyPassive(): scala.Boolean | atMaterialRippleLib.Anon_Passive = js.native
    def applyPassive(globalObj: stdLib.Window): scala.Boolean | atMaterialRippleLib.Anon_Passive = js.native
    def applyPassive(globalObj: stdLib.Window, forceRefresh: scala.Boolean): scala.Boolean | atMaterialRippleLib.Anon_Passive = js.native
    def getMatchesProperty(HTMLElementPrototype: js.Object): js.Array[java.lang.String] = js.native
    def getNormalizedEventCoords(ev: stdLib.Event, pageOffset: atMaterialRippleLib.Anon_X, clientRect: stdLib.ClientRect): atMaterialRippleLib.Anon_X = js.native
    def supportsCssVariables(windowObj: stdLib.Window): js.UndefOr[scala.Boolean] = js.native
    def supportsCssVariables(windowObj: stdLib.Window, forceRefresh: scala.Boolean): js.UndefOr[scala.Boolean] = js.native
  }
  
}

