package typings
package atMaterialDashUiLabLib.speeddialSpeedDialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement & std.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLDivElement & std.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>[P]} */ trait SpeedDialProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SpeedDialClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var ButtonProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.buttonButtonMod.ButtonProps]] = js.undefined
  var TransitionComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var TransitionProps: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.TransitionProps] = js.undefined
  var ariaLabel: java.lang.String
  var direction: js.UndefOr[
    atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.up | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.down | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.left | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.right
  ] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var icon: reactLib.reactMod.ReactNs.ReactNode
  var onClose: js.UndefOr[reactLib.reactMod.ReactNs.ReactEventHandler[js.Object]] = js.undefined
  var open: scala.Boolean
  var openIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double | reactDashTransitionDashGroupLib.Anon_Enter] = js.undefined
}

