package typings
package winrtDashUwpLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the visual content and timing for a single, non-recurring scheduled update to a tile. */
@JSGlobal("Windows.UI.Notifications.ScheduledTileNotification")
@js.native
class ScheduledTileNotification protected () extends js.Object {
  /**
    * Creates and initializes a new instance of the ScheduledTileNotification object for use with a TileUpdater .
    * @param content The object that provides the content for the tile notification.
    * @param deliveryTime The time at which the tile should be updated with the notification information.
    */
  def this(content: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, deliveryTime: stdLib.Date) = this()
  /** Gets the XML description of the content of the scheduled tile update. */
  var content: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
  /** Gets the time at which the tile is scheduled to be updated. */
  var deliveryTime: stdLib.Date = js.native
  /** Gets or sets the time after which the tile notification should no longer be shown. By default, a tile notification does not expire. It is a best practice to explicitly set an expiration time to avoid stale content. */
  var expirationTime: stdLib.Date = js.native
  /** Gets or sets the unique ID that is used to identify the scheduled tile in the schedule. */
  var id: java.lang.String = js.native
  /** Gets or sets a string that Windows can use to prevent duplicate notification content from appearing in the queue. */
  var tag: java.lang.String = js.native
}

