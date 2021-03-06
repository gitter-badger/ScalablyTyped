package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityIndicatorIOSProps extends ViewProps {
  /**
    * Whether to show the indicator (true, the default) or hide it (false).
    */
  var animating: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The foreground color of the spinner (default is gray).
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the indicator should hide when not animating (true by default).
    */
  var hidesWhenStopped: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Invoked on mount and layout changes with
    */
  @JSName("onLayout")
  var onLayout_ActivityIndicatorIOSProps: js.UndefOr[js.Function1[/* event */ reactDashNativeLib.Anon_NativeEvent, scala.Unit]] = js.undefined
  /**
    * Size of the indicator.
    * Small has a height of 20, large has a height of 36.
    *
    * enum('small', 'large')
    */
  var size: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.small | reactDashNativeLib.reactDashNativeLibStrings.large
  ] = js.undefined
}

