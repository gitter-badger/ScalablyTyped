package typings
package chromeDashAppsLib.chromeNs.usbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Since Chrome 29. */
trait EndpointDescriptor extends js.Object {
  /** Transfer type. */
  var address: chromeDashAppsLib.chromeNs.integer
  /**
    * Transfer direction.
    * @see Direction
    */
  var direction: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_IN, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_IN[keyof chrome-apps.Anon_IN] */ js.Any
    ]
  ]
  /**
    * Extra descriptor data associated with this endpoint.
    * @since Chrome 39.
    */
  var extra_data: stdLib.ArrayBuffer
  /** Maximum packet size. */
  var maximumPacketSize: chromeDashAppsLib.chromeNs.integer
  /** Polling interval (interrupt and isochronous only). */
  var pollingInterval: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /**
    * Transfer synchronization mode (isochronous only).
    * @see SynchronizationType
    */
  var synchronization: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ASYNCHRONOUS, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ASYNCHRONOUS[keyof chrome-apps.Anon_ASYNCHRONOUS] */ js.Any
      ]
    ]
  ] = js.undefined
  /**
    * Transfer type.
    * @see TransferType
    *
    */
  var `type`: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_CONTROL, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_CONTROL[keyof chrome-apps.Anon_CONTROL] */ js.Any
    ]
  ]
  /**
    * Endpoint usage hint
    * @see UsageType
    */
  var usage: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_DATA, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_DATA[keyof chrome-apps.Anon_DATA] */ js.Any
      ]
    ]
  ] = js.undefined
}

