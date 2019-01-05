package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateOptions extends js.Object {
  /**
    * Fired when the user pressed a button in the notification.
    * @param notificationId The notificationId of the clicked notification.
    * @param buttonIndex The index of the button clicked by the user.
    */
  val onButtonClicked: WebExtEvent[
    js.Function2[/* notificationId */ java.lang.String, /* buttonIndex */ scala.Double, scala.Unit]
  ] = js.native
  /**
    * Fired when the user clicked in a non-button area of the notification.
    * @param notificationId The notificationId of the clicked notification.
    */
  val onClicked: WebExtEvent[js.Function1[/* notificationId */ java.lang.String, scala.Unit]] = js.native
  /* notifications events */
  /**
    * Fired when the notification closed, either by the system or by user action.
    * @param notificationId The notificationId of the closed notification.
    * @param byUser True if the notification was closed by the user.
    */
  val onClosed: WebExtEvent[
    js.Function2[/* notificationId */ java.lang.String, /* byUser */ scala.Boolean, scala.Unit]
  ] = js.native
  /**
    * Fired when the user changes the permission level.
    * @param level The new permission level.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onPermissionLevelChanged: js.UndefOr[
    WebExtEvent[
      js.Function1[
        /* level */ firefoxDashWebextDashBrowserLib.browserNs.notificationsNs.PermissionLevel, 
        scala.Unit
      ]
    ]
  ] = js.native
  /**
    * Fired when the user clicked on a link for the app's notification settings.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onShowSettings: js.UndefOr[WebExtEvent[js.Function0[scala.Unit]]] = js.native
  /**
    * Fired when the notification is shown.
    * @param notificationId The notificationId of the shown notification.
    */
  val onShown: WebExtEvent[js.Function1[/* notificationId */ java.lang.String, scala.Unit]] = js.native
  /**
    * Clears an existing notification.
    * @param notificationId The id of the notification to be updated.
    */
  def clear(notificationId: java.lang.String): js.Promise[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Creates and displays a notification.
    * @param notificationId Identifier of the notification. If it is empty, this method generates an id. If it matches
    *     an existing notification, this method first clears that notification before proceeding with the create
    *     operation.
    * @param options Contents of the notification.
    */
  def create(
    notificationId: java.lang.String,
    options: firefoxDashWebextDashBrowserLib.browserNs.notificationsNs.CreateNotificationOptions
  ): js.Promise[js.UndefOr[java.lang.String]] = js.native
  /* notifications functions */
  /**
    * Creates and displays a notification.
    * @param options Contents of the notification.
    */
  def create(options: firefoxDashWebextDashBrowserLib.browserNs.notificationsNs.CreateNotificationOptions): js.Promise[js.UndefOr[java.lang.String]] = js.native
  /** Retrieves all the notifications. */
  def getAll(): js.Promise[
    firefoxDashWebextDashBrowserLib.browserNs.notificationsNs.CreateNotificationOptions
  ] = js.native
  /**
    * Retrieves whether the user has enabled notifications from this app or extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  def getPermissionLevel(): js.Promise[firefoxDashWebextDashBrowserLib.browserNs.notificationsNs.PermissionLevel] = js.native
  /**
    * Updates an existing notification.
    * @param notificationId The id of the notification to be updated.
    * @param options Contents of the notification to update to.
    * @deprecated Unsupported on Firefox at this time.
    */
  def update(
    notificationId: java.lang.String,
    options: firefoxDashWebextDashBrowserLib.browserNs.notificationsNs.UpdateNotificationOptions
  ): js.Promise[js.UndefOr[scala.Boolean]] = js.native
}

