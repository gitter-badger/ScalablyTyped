package typings
package reactDashNativeDashModalboxLib.reactDashNativeDashModalboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  /**
    * Duration of the animation
    *
    * Default is 400ms
    *
    */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * (Android only) Close modal when receiving back button event
    *
    * Default is false
    *
    */
  var backButtonClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If a backdrop is displayed behind the modal
    *
    * Default is true
    *
    */
  var backdrop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Background color of the backdrop
    *
    * Default is black
    *
    */
  var backdropColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Add an element in the backdrop (a close button for example)
    *
    * Default is null
    *
    */
  var backdropContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Opacity of the backdrop
    *
    * Default is 0.5
    *
    */
  var backdropOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * If the modal can be closed by pressing on the backdrop
    *
    * Default is true
    *
    */
  var backdropPressToClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Default is false
    */
  var coverScreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The direction modal enters from
    *
    * Default is bottom
    *
    */
  var entry: js.UndefOr[
    reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.top | reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.bottom | java.lang.String
  ] = js.undefined
  /**
    * Checks if the modal is disabled
    *
    * Default is false
    *
    */
  var isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Checks if the modal is open
    *
    * Default is false
    *
    */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This property prevent the modal to cover the ios status bar when the modal is scrolling up because the keyboard is opening
    *
    * Default is ios:22, android:0
    */
  var keyboardTopOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Event fired when the modal is closed and the animation is complete
    *
    */
  var onClosed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * When the state of the swipe to close feature has changed
    * (useful to change the content of the modal, display a message for example)
    *
    *
    */
  var onClosingState: js.UndefOr[js.Function1[/* state */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * Event fired when the modal is opened and the animation is complete
    *
    */
  var onOpened: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * The final position of the modal.
    * Accepts top, center or bottom
    *
    * Default is center
    *
    */
  var position: js.UndefOr[
    reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.top | reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.center | reactDashNativeDashModalboxLib.reactDashNativeDashModalboxLibStrings.bottom | java.lang.String
  ] = js.undefined
  /**
    * If the modal should appear open without animation upon first mount
    *
    * Default is false
    *
    */
  var startOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom styling for the content area
    */
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * The height in pixels of the swipeable area
    *
    * Default is the Window Height
    *
    */
  var swipeArea: js.UndefOr[scala.Double] = js.undefined
  /**
    * The threshold to reach in pixels to close the modal
    *
    * Default is 50
    *
    */
  var swipeThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * If the modal can be closed by swiping
    *
    * Default is true
    *
    */
  var swipeToClose: js.UndefOr[scala.Boolean] = js.undefined
}

