package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the DisconnectButtonClicked event on the DevicePicker object. */
@JSGlobal("Windows.Devices.Enumeration.DeviceDisconnectButtonClickedEventArgs")
@js.native
abstract class DeviceDisconnectButtonClickedEventArgs () extends js.Object {
  /** The device that the user clicked the disconnect button for. */
  var device: DeviceInformation = js.native
}

