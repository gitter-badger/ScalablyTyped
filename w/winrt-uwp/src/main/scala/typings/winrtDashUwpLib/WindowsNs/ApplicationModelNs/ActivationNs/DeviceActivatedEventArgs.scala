package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for a device that invokes AutoPlay. */
@JSGlobal("Windows.ApplicationModel.Activation.DeviceActivatedEventArgs")
@js.native
abstract class DeviceActivatedEventArgs () extends js.Object {
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: scala.Double = js.native
  /** Gets the device identifier for the device that invoked AutoPlay. */
  var deviceInformationId: java.lang.String = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action associated with the activated device. */
  var verb: java.lang.String = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ActivationViewSwitcher = js.native
}

