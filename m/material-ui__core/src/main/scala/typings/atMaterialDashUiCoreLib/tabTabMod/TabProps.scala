package typings
package atMaterialDashUiCoreLib.tabTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps, 'classes' | 'onChange'> ]: @material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps, @material-ui/core.@material-ui/core/Tab/Tab.TabClassKey, 'onChange'>) */ trait TabProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TabClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[atMaterialDashUiCoreLib.Anon_Checked], 
      /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.EventHandler[_]] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var textColor: js.UndefOr[
    java.lang.String | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit
  ] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

