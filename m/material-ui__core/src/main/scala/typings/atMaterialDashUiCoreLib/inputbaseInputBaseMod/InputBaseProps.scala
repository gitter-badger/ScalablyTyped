package typings
package atMaterialDashUiCoreLib.inputbaseInputBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement & std.HTMLDivElement>, 'classes' | 'onChange' | 'onKeyUp' | 'onKeyDown' | 'defaultValue'> ]: react.react.HTMLAttributes<react.HTMLDivElement & std.HTMLDivElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement & std.HTMLDivElement>, @material-ui/core.@material-ui/core/InputBase/InputBase.InputBaseClassKey, 'onChange' | 'onKeyUp' | 'onKeyDown' | 'defaultValue'>) */ trait InputBaseProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[InputBaseClassKey] {
  var autoComplete: js.UndefOr[java.lang.String] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[
    (js.Array[java.lang.String | scala.Double | scala.Boolean | js.Object]) | java.lang.String | scala.Double | scala.Boolean | js.Object
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var endAdornment: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inputComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[InputBaseComponentProps]] = js.undefined
  var inputProps: js.UndefOr[InputBaseComponentProps] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_]] = js.undefined
  var margin: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dense | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.none
  ] = js.undefined
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * `onChange`, `onKeyUp` + `onKeyDown` are applied to the inner `InputComponent`,
    * which by default is an input or textarea. Since these handlers differ from the
    * ones inherited by `React.HTMLAttributes<HTMLDivElement>` we need to omit them.
    *
    * Note that  `blur` and `focus` event handler are applied to the outer `<div>`.
    * So these can just be inherited from the native `<div>`.
    */
  var onChange: js.UndefOr[
    reactLib.reactMod.ReactNs.ChangeEventHandler[
      (reactLib.HTMLTextAreaElement with stdLib.HTMLTextAreaElement) | (reactLib.HTMLInputElement with stdLib.HTMLInputElement)
    ]
  ] = js.undefined
  var onFilled: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onKeyDown: js.UndefOr[
    reactLib.reactMod.ReactNs.KeyboardEventHandler[
      (reactLib.HTMLTextAreaElement with stdLib.HTMLTextAreaElement) | (reactLib.HTMLInputElement with stdLib.HTMLInputElement)
    ]
  ] = js.undefined
  var onKeyUp: js.UndefOr[
    reactLib.reactMod.ReactNs.KeyboardEventHandler[
      (reactLib.HTMLTextAreaElement with stdLib.HTMLTextAreaElement) | (reactLib.HTMLInputElement with stdLib.HTMLInputElement)
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var renderPrefix: js.UndefOr[
    js.Function1[
      /* state */ atMaterialDashUiCoreLib.Anon_Disabled, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var rows: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var rowsMax: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var startAdornment: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[
    (js.Array[java.lang.String | scala.Double | scala.Boolean | js.Object]) | java.lang.String | scala.Double | scala.Boolean | js.Object
  ] = js.undefined
}

