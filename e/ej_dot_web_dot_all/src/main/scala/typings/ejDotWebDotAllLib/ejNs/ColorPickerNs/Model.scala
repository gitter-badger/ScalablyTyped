package typings
package ejDotWebDotAllLib.ejNs.ColorPickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Allows to change the mode of the button. Please refer below to know available button mode
    * @Default {ej.ButtonMode.Split}
    */
  var buttonMode: js.UndefOr[ejDotWebDotAllLib.ejNs.ButtonMode | java.lang.String] = js.undefined
  /** The ColorPicker control allows to define the customized text to displayed in button elements. Using the property to achieve the customized culture values.
    * @Default {{ apply: Apply, cancel: Cancel, swatches: Swatches }}
    */
  var buttonText: js.UndefOr[ButtonText] = js.undefined
  /** Fires after Color value has been changed successfully.If the user want to perform any operation after the color value changed then the user can make use of this change event.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires after closing the color picker popup.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, scala.Unit]] = js.undefined
  /** Specifies the number of columns to be displayed color palette model.
    * @Default {10}
    */
  var columns: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Fires after Color picker control is created. If the user want to perform any operation after the color picker control creation then the user can make use of this create event.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** This property allows you to customize its appearance using user-defined CSS and custom skin options such as colors and backgrounds.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** This property allows to define the custom colors in the palette model.Custom palettes are created by passing a comma delimited string of HEX values or an array of colors.
    * @Default {empty}
    */
  var custom: js.UndefOr[js.Array[_]] = js.undefined
  /** Fires after Color picker control is destroyed. If the user want to perform any operation after the color picker control destroyed then the user can make use of this destroy event.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** This property allows to embed the popup in the order of DOM element flow . When we set the value as true, the color picker popup is always in visible state.
    * @Default {false}
    */
  var displayInline: js.UndefOr[scala.Boolean] = js.undefined
  /** This property allows to enable or disable the opacity slider in the color picker control
    * @Default {true}
    */
  var enableOpacity: js.UndefOr[scala.Boolean] = js.undefined
  /** This property allows to change the control in enabled or disabled state.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** It allows to define the characteristics of the ColorPicker control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Defines the localized text values in button and tooltip.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the model type to be rendered initially in the color picker control. See below to get available ModelType
    * @Default {ej.ColorPicker.ModelType.Default}
    */
  var modelType: js.UndefOr[ModelType | java.lang.String] = js.undefined
  /** This property allows to change the opacity value .The selected color opacity will be adjusted by using this opacity value.
    * @Default {100}
    */
  var opacityValue: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Fires after opening the color picker popup
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** Specifies the palette type to be displayed at initial time in palette model.There two types of palette model available in ColorPicker control. See below available Palette
    * @Default {ej.ColorPicker.Palette.BasicPalette}
    */
  var palette: js.UndefOr[Palette | java.lang.String] = js.undefined
  /** This property allows to define the preset model to be rendered initially in palette type.It consists of 12 different types of presets. Each presets have 50 colors. See below
    * available Presets
    * @Default {ej.ColorPicker.Presets.Basic}
    */
  var presetType: js.UndefOr[Presets | java.lang.String] = js.undefined
  /** Fires after Color value has been selected successfully. If the user want to perform any operation after the color value selected then the user can make use of this select event.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, scala.Unit]] = js.undefined
  /** Allows to show/hides the apply and cancel buttons in ColorPicker control
    * @Default {true}
    */
  var showApplyCancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows to show/hides the clear button in ColorPicker control
    * @Default {true}
    */
  var showClearButton: js.UndefOr[scala.Boolean] = js.undefined
  /** This property allows to provides live preview support for current cursor selection color and selected color.
    * @Default {true}
    */
  var showPreview: js.UndefOr[scala.Boolean] = js.undefined
  /** This property allows to store the color values in custom list.The ColorPicker will keep up to 11 colors in a custom list.By clicking the add button, the selected color from picker
    * or palette will get added in the recent color list.
    * @Default {false}
    */
  var showRecentColors: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows to show/hides the switcher button in ColorPicker control.It helps to switch palette or picker mode in colorpicker.
    * @Default {true}
    */
  var showSwitcher: js.UndefOr[scala.Boolean] = js.undefined
  /** This property allows to shows tooltip to notify the slider value in color picker control.
    * @Default {false}
    */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the toolIcon to be displayed in dropdown control color area.
    * @Default {null}
    */
  var toolIcon: js.UndefOr[java.lang.String] = js.undefined
  /** This property allows to define the customized text or content to displayed when mouse over the following elements. This property also allows to use the culture values.
    * @Default {{ switcher: Switcher, addButton: Add Color, basic: Basic, monoChrome: Mono Chrome, flatColors: Flat Color, seaWolf: Sea Wolf, webColors: Web Colors, sandy: Sandy,
    * pinkShades: Pink Shades, misty: Misty, citrus: Citrus, vintage: Vintage, moonLight: Moon Light, candyCrush: Candy Crush, currentColor: Current Color, selectedColor: Selected
    * Color }}
    */
  var tooltipText: js.UndefOr[TooltipText] = js.undefined
  /** Specifies the color value for color picker control, the value is in hexadecimal form with prefix of &quot;#&quot;.
    * @Default {null}
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

