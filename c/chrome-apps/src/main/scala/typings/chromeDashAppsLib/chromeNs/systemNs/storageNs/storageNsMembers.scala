package typings
package chromeDashAppsLib.chromeNs.systemNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.storage")
@js.native
object storageNsMembers extends js.Object {
  val EjectDeviceResultCode: chromeDashAppsLib.Anon_SUCCESS = js.native
  val StorageUnitType: chromeDashAppsLib.Anon_FIXED = js.native
  /** Fired when a new removable storage is attached to the system. */
  val onAttached: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* info */ StorageUnitInfo, scala.Unit]] = js.native
  /** Fired when a removable storage is detached from the system. */
  val onDetached: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* id */ java.lang.String, scala.Unit]] = js.native
  /**
    * Ejects a removable storage device.
    * @param callback
    * Parameter **result**:
    *
    * **success:** The ejection command is successful -- the application can prompt the user to remove the device;
    *
    * **in_use:** The device is in use by another application. The ejection did not succeed;
    *   the user should not remove the device until the other application is done with the device;
    *
    * **no_such_device:** There is no such device known.
    *
    * **failure:** The ejection command failed.
    */
  def ejectDevice(
    id: java.lang.String,
    callback: js.Function1[
      /* result */ chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_SUCCESS, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_SUCCESS[keyof chrome-apps.Anon_SUCCESS] */ js.Any
        ]
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Get the available capacity of a specified |id| storage device. The |id| is the transient device ID from StorageUnitInfo.
    * @since Dev channel only.
    */
  def getAvailableCapacity(id: java.lang.String, callback: js.Function1[/* info */ StorageCapacityInfo, scala.Unit]): scala.Unit = js.native
  /** Get the storage information from the system. The argument passed to the callback is an array of StorageUnitInfo objects. */
  def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], scala.Unit]): scala.Unit = js.native
}

