package typings
package atMaterialDashUiCoreLib.drawerDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, 'classes' | 'open' | 'children'> ]: @material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, @material-ui/core.@material-ui/core/Drawer/Drawer.DrawerClassKey, 'open' | 'children'>) */ trait DrawerProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[DrawerClassKey] {
  var ModalProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.modalModalMod.ModalProps]] = js.undefined
  var PaperProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.paperPaperMod.PaperProps]] = js.undefined
  var SlideProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.slideSlideMod.SlideProps]] = js.undefined
  var anchor: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.left | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.top | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.right | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.bottom
  ] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var elevation: js.UndefOr[scala.Double] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var theme: js.UndefOr[atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme] = js.undefined
  var transitionDuration: js.UndefOr[js.Any] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.permanent | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.persistent | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.temporary
  ] = js.undefined
}

