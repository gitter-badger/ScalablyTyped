package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Direction extends js.Object {
  /** Direction, Recipient, RequestType, and TransferType all map to their namesakes within the USB specification. */
  val Direction: Anon_IN = js.native
  /** Direction, Recipient, RequestType, and TransferType all map to their namesakes within the USB specification. */
  val Recipient: Anon_DEVICE = js.native
  /** Direction, Recipient, RequestType, and TransferType all map to their namesakes within the USB specification. */
  val RequestType: Anon_STANDARD = js.native
  val SynchronizationType: Anon_ASYNCHRONOUS = js.native
  /** Direction, Recipient, RequestType, and TransferType all map to their namesakes within the USB specification. */
  val TransferType: Anon_CONTROL = js.native
  val UsageType: Anon_DATA = js.native
  /**
    * Event generated when a device is added to the system.
    * Events are only broadcast to apps that have permission to access the device.
    * Permission may have been granted at install time, when the user accepted an optional permission
    * (@see[permissions.request]{https://developer.chrome.com/apps/permissions#method-request}),
    * or through **getUserSelectedDevices**.
    * @since Chrome 42.
    */
  val onDeviceAdded: chromeDashAppsLib.chromeNs.usbNs.DeviceEvent = js.native
  /**
    * Event generated when a device is removed from the system.
    * See **onDeviceAdded** for which events are delivered.
    * @since Chrome 42.
    */
  val onDeviceRemoved: chromeDashAppsLib.chromeNs.usbNs.DeviceEvent = js.native
  /**
    * @description Performs a bulk transfer on the specified device.
    * @param handle An open connection to the device.
    * @param transferInfo The transfer parameters.
    * @param callback
    */
  def bulkTransfer(
    handle: chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle,
    transferInfo: chromeDashAppsLib.chromeNs.usbNs.GenericTransferInfo,
    callback: js.Function1[/* info */ chromeDashAppsLib.chromeNs.usbNs.TransferResultInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Claims an interface on a USB device.
    * Before data can be transfered to an interface or associated endpoints the interface must be claimed.
    * Only one connection handle can claim an interface at any given time.
    * If the interface is already claimed, this call will fail.
    *
    * **releaseInterface** should be called when the interface is no longer needed.
    * @param handle An open connection to the device.
    * @param interfaceNumber The interface to be claimed.
    * @param callback
    */
  def claimInterface(
    handle: chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle,
    interfaceNumber: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Closes a connection handle.
    * Invoking operations on a handle after it has been closed is a safe operation but causes no action to be taken.
    * @param handle The ConnectionHandle to close.
    * @param [callback]
    */
  def closeDevice(handle: chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle): scala.Unit = js.native
  def closeDevice(handle: chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Performs a control transfer on the specified device.
    * Control transfers refer to either the device, an interface or an endpoint.
    * Transfers to an interface or endpoint require the interface to be claimed.
    * @param handle An open connection to the device.
    * @param transferInfo Transfer info
    * @param callback
    */
  def controlTransfer(
    handle: chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle,
    transferInfo: chromeDashAppsLib.chromeNs.usbNs.TransferInfo,
    callback: js.Function1[/* info */ chromeDashAppsLib.chromeNs.usbNs.TransferResultInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Finds USB devices specified by the vendor, product and (optionally) interface IDs and if permissions allow opens them for use.
    * If the access request is rejected or the device fails to be opened a connection handle will not be created or returned.
    * Calling this method is equivalent to calling *getDevices* followed by *openDevice* for each device.
    * @param options The properties to search for on target devices.
    *                  - vendorId: The device vendor ID.
    *                  - productId: The product ID.
    *                  - The interface ID to request access to. Only available on Chrome OS. It has no effect on other platforms.
    * @requires(CrOS) Chrome OS if you specify *interfaceId*
    * @param callback
    */
  def findDevices(
    options: Anon_VendorIdProductId,
    callback: js.Function1[
      /* handles */ js.Array[chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Finds USB devices specified by the vendor, product and (optionally) interface IDs and if permissions allow opens them for use.
    * If the access request is rejected or the device fails to be opened a connection handle will not be created or returned.
    * Calling this method is equivalent to calling *getDevices* followed by *openDevice* for each device.
    * @param options The properties to search for on target devices.
    *                  - vendorId: The device vendor ID.
    *                  - productId: The product ID.
    * @param callback
    */
  def findDevices(
    options: Anon_VendorId,
    callback: js.Function1[
      /* handles */ js.Array[chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Gets the configuration descriptor for the currently selected configuration.
    * @since Chrome 39.
    * @param handle An open connection to the device.
    * @param callback
    */
  def getConfiguration(
    handle: chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle,
    callback: js.Function1[/* config */ chromeDashAppsLib.chromeNs.usbNs.ConfigDescriptor, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Returns the full set of device configuration descriptors.
    * @since Chrome 47.
    * @param device The Device to fetch descriptors from.
    * @param callback
    */
  def getConfigurations(
    device: chromeDashAppsLib.chromeNs.usbNs.Device,
    callback: js.Function1[
      /* configs */ js.Array[chromeDashAppsLib.chromeNs.usbNs.ConfigDescriptor], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * @description Enumerates connected USB devices.
    * @since Chrome 39.
    * @param options The properties to search for on target devices.
    * @param callback
    */
  def getDevices(
    options: Anon_FiltersArray,
    callback: js.Function1[/* devices */ js.Array[chromeDashAppsLib.chromeNs.usbNs.Device], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Presents a device picker to the user and returns the Devices selected.
    * If the user cancels the picker devices will be empty.
    * A user gesture is required for the dialog to display. Without a user gesture,
    * the callback will run as though the user cancelled.
    * @since Chrome 40.
    * @param options Configuration of the device picker dialog box.
    *               - multiple: Allow the user to select multiple devices.
    *               - filters: Filter the list of devices presented to the user.
    *                   If multiple filters are provided, devices matching any filter will be displayed.
    * @param callback Invoked with a list of chosen Devices.
    */
  def getUserSelectedDevices(
    options: Anon_Multiple,
    callback: js.Function1[/* devices */ js.Array[chromeDashAppsLib.chromeNs.usbNs.Device], scala.Unit]
  ): scala.Unit = js.native
  /**
    * @description Performs an interrupt transfer on the specified device.
    * @param handle An open connection to the device.
    * @param transferInfo The transfer parameters.
    * @param callback
    */
  def interruptTransfer(
    handle: chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle,
    transferInfo: chromeDashAppsLib.chromeNs.usbNs.GenericTransferInfo,
    callback: js.Function1[/* info */ chromeDashAppsLib.chromeNs.usbNs.TransferResultInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @description Performs an isochronous transfer on the specific device.
    * @param handle An open connection to the device.
    * @param transferInfo
    * @param callback
    */
  def isochronousTransfer(
    handle: chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle,
    transferInfo: chromeDashAppsLib.chromeNs.usbNs.IsochronousTransferInfo,
    callback: js.Function1[/* info */ chromeDashAppsLib.chromeNs.usbNs.TransferResultInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @description Lists all interfaces on a USB device.
    * @param handle An open connection to the device.
    * @param callback
    */
  def listInterfaces(
    handle: chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle,
    callback: js.Function1[
      /* descriptors */ js.Array[chromeDashAppsLib.chromeNs.usbNs.InterfaceDescriptor], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Opens a USB device returned by *getDevices*
    * @since Chrome 31.
    * @param device The device to open.
    * @param callback
    */
  def openDevice(
    device: chromeDashAppsLib.chromeNs.usbNs.Device,
    callback: js.Function1[/* handle */ chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @description Releases a claimed interface.
    * @param handle An open connection to the device.
    * @param interfaceNumber The interface to be released.
    * @param callback
    */
  def releaseInterface(
    handle: chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle,
    interfaceNumber: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * @deprecated Since Chrome 40.
    * @requires(CrOS) Chrome OS specific. This operation is now implicitly performed as a part of *openDevice*.
    */
  def requestAccess(
    device: chromeDashAppsLib.chromeNs.usbNs.Device,
    interfaceId: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function1[/* success */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Tries to reset the USB device. If the reset fails, the given connection handle will be closed
    * and the USB device will appear to be disconnected then reconnected.
    * In this case **getDevices** or **findDevices** must be called again to acquire the device.
    * @param handle A connection handle to reset.
    * @param callback
    */
  def resetDevice(
    handle: chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle,
    callback: js.Function1[/* success */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Select a device configuration.
    * This function effectively resets the device by selecting one of the
    * device's available configurations. Only configuration values greater
    * than 0 are valid however some buggy devices have a working
    * configuration 0 and so this value is allowed.
    * @since Chrome 42.
    * @param handle An open connection to the device.
    * @param configurationValue
    * @param callback
    */
  def setConfiguration(
    handle: chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle,
    configurationValue: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * @description Selects an alternate setting on a previously claimed interface.
    * @param handle An open connection to the device where this interface has been claimed.
    * @param interfaceNumber The interface to configure.
    * @param alternateSetting The alternate setting to configure.
    * @param callback
    */
  def setInterfaceAlternateSetting(
    handle: chromeDashAppsLib.chromeNs.usbNs.ConnectionHandle,
    interfaceNumber: chromeDashAppsLib.chromeNs.integer,
    alternateSetting: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

