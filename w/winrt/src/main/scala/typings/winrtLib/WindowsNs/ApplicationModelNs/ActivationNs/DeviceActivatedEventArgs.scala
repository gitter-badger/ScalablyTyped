package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.DeviceActivatedEventArgs")
@js.native
class DeviceActivatedEventArgs () extends IDeviceActivatedEventArgs {
  /* CompleteClass */
  override var deviceInformationId: java.lang.String = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /* CompleteClass */
  override var verb: java.lang.String = js.native
}

