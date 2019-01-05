package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait SearchBarProps extends js.Object {
  /**
    * Specify color, styling, or another Material Icon Name
    * (Note: pressing on this icon clears text inside the searchbar)
    *
    * @default "{ color: '#86939e', name: 'search' }"
    */
  var clearIcon: js.UndefOr[IconObject] = js.undefined
  /**
    * @deprecated
    * Get ref of TextInput container
    */
  var containerRef: js.UndefOr[js.Function1[/* ref */ js.Any, scala.Unit]] = js.undefined
  /**
    * TextInput container styling
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Specify color, styling, or another Material Icon Name
    */
  var icon: js.UndefOr[IconObject] = js.undefined
  /**
    * TextInput styling
    */
  var inputStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * @default false		change theme to light theme
    */
  var lightTheme: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify color, styling of the loading ActivityIndicator effect
    *
    * @default "{ color: '#86939e' }"
    */
  var loadingIcon: js.UndefOr[IconObject] = js.undefined
  /**
    * Remove icon from textinput
    *
    * @default false
    */
  var noIcon: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Method to fire when text is changed
    */
  var onChangeText: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Method fired when text is cleared via the clear button
    */
  var onClearText: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Set the placeholder text
    *
    * @default ''
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the color of the placeholder text
    *
    * @default '#86939e'
    */
  var placeholderTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Change TextInput styling to rounded corners
    *
    * @default false
    */
  var round: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show the loading ActivityIndicator effect
    *
    * @default false
    */
  var showLoadingIcon: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    * Get ref of TextInput
    */
  var textInputRef: js.UndefOr[
    js.Function1[/* ref */ reactDashNativeLib.reactDashNativeMod.TextInput, scala.Unit]
  ] = js.undefined
  /**
    * Specify other than the default transparent underline color
    *
    * @default 'transparent'
    */
  var underlineColorAndroid: js.UndefOr[java.lang.String] = js.undefined
}

