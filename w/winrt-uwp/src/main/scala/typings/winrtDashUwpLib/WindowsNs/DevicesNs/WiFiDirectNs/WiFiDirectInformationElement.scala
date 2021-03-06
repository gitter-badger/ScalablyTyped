package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information elements in a Wi-Fi Direct packet. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectInformationElement")
@js.native
/** Creates a new WiFiDirectInformationElement object. */
class WiFiDirectInformationElement () extends js.Object {
  /** A three-byte organization identifier used to indicate the organization which defined a vendor extension information element (IE). */
  var oui: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** A one byte type value used in a vendor extension information element (IE) to distinguish between different IE formats defined by the same organization. */
  var ouiType: scala.Double = js.native
  /** The value of the information element. */
  var value: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
}

/** Represents information elements in a Wi-Fi Direct packet. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectInformationElement")
@js.native
object WiFiDirectInformationElement extends js.Object {
  /**
    * Create an array of information elements from a data buffer.
    * @param buffer The data buffer that contains a information element.
    * @return A array of information elements created from the buffer.
    */
  def createFromBuffer(buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectInformationElement] = js.native
  /**
    * Create an array of information elements from a DeviceInformation object.
    * @param deviceInformation The device information object that contains the information elements.
    * @return A array of information elements created from the device information object.
    */
  def createFromDeviceInformation(deviceInformation: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectInformationElement] = js.native
}

