package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to map a contact. */
@JSGlobal("Windows.UI.WebUI.WebUIContactMapActivatedEventArgs")
@js.native
abstract class WebUIContactMapActivatedEventArgs () extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the address of a contact for the mapping operation. */
  var address: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAddress = js.native
  /** Gets the contact for the mapping operation. */
  var contact: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.Contact = js.native
  /** Gets the activation type. */
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
  /** Gets the action to be performed. */
  var verb: java.lang.String = js.native
}

