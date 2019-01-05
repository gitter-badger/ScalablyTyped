package typings
package atMaterialDashUiCoreLib.typographyTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLElement & std.HTMLElement>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLElement & std.HTMLElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLElement & std.HTMLElement>, @material-ui/core.@material-ui/core/Typography/Typography.TypographyClassKey, never>) */ trait TypographyProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TypographyClassKey] {
  var align: js.UndefOr[atMaterialDashUiCoreLib.coreMod.PropTypesNs.Alignment] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[
    atMaterialDashUiCoreLib.coreMod.PropTypesNs.Color | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.textPrimary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.textSecondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.error
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[TypographyProps]] = js.undefined
  var gutterBottom: js.UndefOr[scala.Boolean] = js.undefined
  var headlineMapping: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.TypographyProps with js.Any
  ] = js.undefined
  var noWrap: js.UndefOr[scala.Boolean] = js.undefined
  var paragraph: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var variant: js.UndefOr[Style | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit] = js.undefined
}

