package typings
package ejDotWebDotAllLib.ejNs.ToggleButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specify the icon in active state to the toggle button and it will be aligned from left margin of the button.
    */
  var activePrefixIcon: js.UndefOr[java.lang.String] = js.undefined
  /** Specify the icon in active state to the toggle button and it will be aligned from right margin of the button.
    */
  var activeSuffixIcon: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the text when ToggleButton is in active state i.e.,checked state.
    * @Default {null}
    */
  var activeText: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when ToggleButton control state is changed successfully.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires when ToggleButton control is clicked successfully.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Specifies the contentType of the ToggleButton. See ContentType as below
    * @Default {ej.ContentType.TextOnly}
    */
  var contentType: js.UndefOr[ejDotWebDotAllLib.ejNs.ContentType | java.lang.String] = js.undefined
  /** Fires when ToggleButton control is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Specify the CSS class to the ToggleButton to achieve custom theme.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Specify the icon in default state to the toggle button and it will be aligned from left margin of the button.
    */
  var defaultPrefixIcon: js.UndefOr[java.lang.String] = js.undefined
  /** Specify the icon in default state to the toggle button and it will be aligned from right margin of the button.
    */
  var defaultSuffixIcon: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the text of the ToggleButton, when the control is a default state. i.e., unChecked state.
    * @Default {null}
    */
  var defaultText: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when ToggleButton control is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Save current model value to browser cookies for maintaining states. When refreshing the ToggleButton control page, the model value is applied from browser cookies or HTML 5local
    * storage.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify the Right to Left direction of the ToggleButton.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the state of the ToggleButton.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the height of the ToggleButton.
    * @Default {28pixel}
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** It allows to define the characteristics of the ToggleButton control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specifies the image position of the ToggleButton.
    * @Default {ej.ImagePosition.ImageLeft}
    */
  var imagePosition: js.UndefOr[ejDotWebDotAllLib.ejNs.ImagePosition | java.lang.String] = js.undefined
  /** Allows to prevents the control switched to checked (active) state.
    * @Default {false}
    */
  var preventToggle: js.UndefOr[scala.Boolean] = js.undefined
  /** Displays the ToggleButton with rounded corners.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the size of the ToggleButton. See ButtonSize as below
    * @Default {ej.ButtonSize.Normal}
    */
  var size: js.UndefOr[ejDotWebDotAllLib.ejNs.ButtonSize | java.lang.String] = js.undefined
  /** It allows to define the ToggleButton state to checked(Active) or unchecked(Default) at initial time.
    * @Default {false}
    */
  var toggleState: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the type of the ToggleButton. See ButtonType as below
    * @Default {ej.ButtonType.Button}
    */
  var `type`: js.UndefOr[ejDotWebDotAllLib.ejNs.ButtonType | java.lang.String] = js.undefined
  /** Specifies the width of the ToggleButton.
    * @Default {100pixel}
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

